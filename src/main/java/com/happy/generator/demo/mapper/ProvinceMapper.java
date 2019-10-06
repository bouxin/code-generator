package com.happy.generator.demo.mapper;

import com.happy.generator.demo.entity.ProvinceDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 地区省份表 Mapper 接口
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.mapper.ProvinceMapper
 */
@Mapper
@Repository
public interface ProvinceMapper extends BaseMapper<ProvinceDO> {

}
