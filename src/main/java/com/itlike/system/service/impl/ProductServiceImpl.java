package com.itlike.system.service.impl;

import com.itlike.system.entity.Product;
import com.itlike.system.mapper.ProductMapper;
import com.itlike.system.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
