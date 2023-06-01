package com.xhmall.product;

import com.xhmall.product.entity.BrandEntity;
import com.xhmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("中华有为");
        brandService.updateById(brandEntity);
        System.out.println("保存成功...");
    }

}
