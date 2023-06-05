package com.xhmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.xhmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lihuan
 * @email zjutlihuan2022@gmail.com
 * @date 2023-05-31 20:53:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

