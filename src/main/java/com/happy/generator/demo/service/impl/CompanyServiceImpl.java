package com.happy.generator.demo.service.impl;

import com.happy.generator.demo.entity.CompanyDO;
import com.happy.generator.demo.mapper.CompanyMapper;
import com.happy.generator.demo.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业信息表 服务实现类
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.service.impl.CompanyServiceImpl
 */
@Service("ICompanyService")
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, CompanyDO> implements ICompanyService {

}
