package com.itlike.system.service.impl;

import com.itlike.system.entity.Package;
import com.itlike.system.mapper.PackageMapper;
import com.itlike.system.service.IPackageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linlin
 * @since 2021-01-05
 */
@Service
public class PackageServiceImpl extends ServiceImpl<PackageMapper, Package> implements IPackageService {

}
