package com.itlike.system.mapper;

import com.itlike.system.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linlin
 * @since 2021-01-05
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
