package com.xhmall.product.dao;

import com.xhmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lihuan
 * @email zjutlihuan2022@gmail.com
 * @date 2023-05-31 20:53:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
