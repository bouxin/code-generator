package com.happy.generator.demo.mapper;

import com.happy.generator.demo.entity.CompanyDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 企业信息表 Mapper 接口
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.mapper.CompanyMapper
 */
@Mapper
@Repository
public interface CompanyMapper extends BaseMapper<CompanyDO> {

}
