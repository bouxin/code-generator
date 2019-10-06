package com.happy.generator.demo.service.impl;

import com.happy.generator.demo.entity.CityDO;
import com.happy.generator.demo.mapper.CityMapper;
import com.happy.generator.demo.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 市区级表 服务实现类
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.service.impl.CityServiceImpl
 */
@Service("ICityService")
public class CityServiceImpl extends ServiceImpl<CityMapper, CityDO> implements ICityService {

}
