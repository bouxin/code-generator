import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author luxc
 * @date 2019-09-29
 */
public class Main {

  private static final Logger log = Logger.getAnonymousLogger();
  private static String prefix = null;
  private static String outputDir = null;
  private static String packagePath = null;
  private static List<String> whitelist = new ArrayList<>();

  public static void main(String[] args) {
    Properties properties = new Properties();
    try {
      properties.load(ClassLoader.getSystemResourceAsStream("generator.properties"));
      prefix = properties.getProperty("whitelistPattern");
      outputDir = properties.getProperty("output.dir");
      packagePath = properties.getProperty("parent.package");
      if (packagePath != null) {
        packagePath = "/" + packagePath.replace(".", "/");
      }
      String str = properties.getProperty("whitelist");
      if (str != null && str.trim().length() > 0) {
        whitelist.addAll(Arrays.asList(str.split(",")));
      }
    } catch (Exception e) {
      log.info("config file error!");
      return;
    }

    DataSourceConfig dataSource = new DataSourceConfig();

    dataSource.setUrl(properties.getProperty("datasource.url"));
    dataSource.setUsername(properties.getProperty("datasource.username"));
    dataSource.setPassword(properties.getProperty("datasource.password"));
    dataSource.setDriverName(properties.getProperty("datasource.driver"));

    String outputDir = properties.getProperty("output.dir");
    String author = properties.getProperty("author");
    String parentPath = properties.getProperty("parent.package");

    generator(dataSource, author, outputDir, parentPath);
  }

  private static void generator(DataSourceConfig datasource, String author, String outputDir, String parentPath) {
    // 生成器全局配置
    GlobalConfig globalConfig = new GlobalConfig();
    globalConfig.setOpen(false);
    globalConfig.setBaseResultMap(true);
    globalConfig.setBaseColumnList(true);
    globalConfig.setFileOverride(true);
    globalConfig.setAuthor(author);
    globalConfig.setOutputDir(outputDir);
    globalConfig.setActiveRecord(true);
    globalConfig.setSwagger2(true);
    globalConfig.setEnableCache(false);


    // 数据源配置
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    dataSourceConfig.setDbType(DbType.MYSQL);
    dataSourceConfig.setUrl(datasource.getUrl());
    dataSourceConfig.setDriverName(datasource.getDriverName());
    dataSourceConfig.setUsername(datasource.getUsername());
    dataSourceConfig.setPassword(datasource.getPassword());

    // 生成策略配置
    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    strategyConfig.setRestControllerStyle(true);
    strategyConfig.setEntityBuilderModel(true);
    strategyConfig.setEntityLombokModel(true);
    strategyConfig.setSkipView(true);

    // package配置
    PackageConfig packageConfig = new PackageConfig().setParent(parentPath);

    ConfigBuilder configBuilder = new ConfigBuilder(packageConfig, dataSourceConfig, strategyConfig, null, globalConfig);

    List<TableInfo> tableInfoList = configBuilder.getTableInfoList().stream()
            // whitelist
            .filter(tableInfo -> tableInfo.getName().startsWith(prefix))
            .filter(tableInfo -> whitelist.contains(tableInfo.getName()))
            .peek(tableEntity -> tableEntity.setEntityName(filterName(tableEntity.getEntityName()) + "DO"))
            .collect(Collectors.toList());
    configBuilder.setTableInfoList(tableInfoList);

    // 生成器
    (new AutoGenerator()).setCfg(injectionConfig()).setConfig(configBuilder).execute();

  }

  private static InjectionConfig injectionConfig() {
    // 自定义输出配置
    List<FileOutConfig> focList = new ArrayList<>();
    // 自定义配置会被优先输出
    focList.add(new FileOutConfig("templates/mapper.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名
        String mapperName = filterName(tableInfo.getMapperName());
        tableInfo.setMapperName(mapperName);
        return outputDir + packagePath + "/mapper/" + mapperName + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("templates/mapper.xml.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名
        String mapperName = filterName(tableInfo.getMapperName());
        tableInfo.setXmlName(mapperName);
        return outputDir + packagePath + "/mapper/xml/" + mapperName + StringPool.DOT_XML;
      }
    });
    focList.add(new FileOutConfig("templates/service.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名
        String serviceName = filterName(tableInfo.getServiceName());
        tableInfo.setServiceName(serviceName);
        return outputDir + packagePath + "/service/" + serviceName + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("templates/controller.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名
        String controllerName = filterName(tableInfo.getControllerName());
        tableInfo.setControllerName(controllerName);
        return outputDir + packagePath + "/controller/" + controllerName + StringPool.DOT_JAVA;
      }
    });
    focList.add(new FileOutConfig("templates/serviceImpl.java.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输出文件名
        String serviceImplName = filterName(tableInfo.getServiceImplName());
        tableInfo.setServiceImplName(serviceImplName);
        return outputDir + packagePath + "/service/impl/" + (serviceImplName) + StringPool.DOT_JAVA;
      }
    });

    InjectionConfig cfg = new InjectionConfig() {
      @Override
      public void initMap() {
        // to do nothing
      }
    };
    cfg.setFileOutConfigList(focList);
    return cfg;
  }

  private static String filterName(String name) {
    return name;
  }
}
