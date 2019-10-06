package com.happy;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author lubosson
 * @see com.happy
 * @since 2019-09-29
 */
public class MpgGenerator {

  private static Logger log = Logger.getAnonymousLogger();

  public static void main(String[] args) {
    Properties properties = new Properties();
    try {
      properties.load(ClassLoader.getSystemResourceAsStream("generator.properties"));
    } catch (Exception e) {
      log.info("config file error!");
      return;
    }

    DataSourceConfig dataSource = new DataSourceConfig();

    dataSource.setUrl(properties.getProperty("datasource.url"));
    dataSource.setUsername(properties.getProperty("datasource.username"));
    dataSource.setPassword(properties.getProperty("datasource.password"));

    String outputDir = properties.getProperty("output.dir");
    String author = properties.getProperty("author");
    String parentPath = properties.getProperty("parent.package");

    generator(dataSource, author, outputDir, parentPath);
  }

  private static void generator(DataSourceConfig datasource, String author, String outputDir,
      String parentPath) {
    // 生成器全局配置
    GlobalConfig globalConfig = new GlobalConfig();

    globalConfig.setOpen(false);
    globalConfig.setAuthor(author);
    globalConfig.setOutputDir(outputDir);
    globalConfig.setBaseResultMap(true);
    globalConfig.setBaseColumnList(true);
    globalConfig.setFileOverride(true);

    // 数据源配置
    DataSourceConfig dataSourceConfig = new DataSourceConfig()
        .setDbType(DbType.MYSQL)
        .setUrl(datasource.getUrl())
        .setDriverName("com.mysql.jdbc.Driver")
        .setUsername(datasource.getUsername())
        .setPassword(datasource.getPassword());

    // 生成策略配置
    StrategyConfig strategyConfig = new StrategyConfig()
        .setNaming(NamingStrategy.underline_to_camel)
        .setRestControllerStyle(true);

    // package配置
    PackageConfig packageConfig = new PackageConfig()
        .setParent(parentPath);

    // 模版配置
//    TemplateConfig templateConfig = new TemplateConfig()
//        .setController("/templates/controller.java.vm")
//        .setService("/templates/service.java.vm")
//        .setServiceImpl("/templates/serviceImpl.java.vm")
//        .setMapper("/templates/mapper.java.vm")
//        .setXml("/templates/mapper.xml.vm")
//        .setEntity("/templates/entity.java.vm");

    ConfigBuilder configBuilder = new ConfigBuilder(
        packageConfig, dataSourceConfig, strategyConfig, null, globalConfig);

    List<TableInfo> tableInfoList = configBuilder.getTableInfoList();

    tableInfoList.forEach(
        tableEntity -> tableEntity.setEntityName(tableEntity.getEntityName().concat("DO")));

    // 生成器
    new AutoGenerator().setConfig(configBuilder).execute();

  }
}
