package com.happy.generator.demo.mapper;

import com.happy.generator.demo.entity.CityDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 市区级表 Mapper 接口
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.mapper.CityMapper
 */
@Mapper
@Repository
public interface CityMapper extends BaseMapper<CityDO> {

}
