package com.happy.generator.demo.service.impl;

import com.happy.generator.demo.entity.ProvinceDO;
import com.happy.generator.demo.mapper.ProvinceMapper;
import com.happy.generator.demo.service.IProvinceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地区省份表 服务实现类
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.service.impl.ProvinceServiceImpl
 */
@Service("IProvinceService")
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, ProvinceDO> implements IProvinceService {

}
