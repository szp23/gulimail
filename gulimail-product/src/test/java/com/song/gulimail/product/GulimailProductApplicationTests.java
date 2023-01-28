package com.song.gulimail.product;

import com.song.gulimail.product.entity.BrandEntity;
import com.song.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("ceshi");
        brandEntity.setDescript("ceshi");
        brandService.save(brandEntity);
        System.out.println("save ok!");
    }

}
