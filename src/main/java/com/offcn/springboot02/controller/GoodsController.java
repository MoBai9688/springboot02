package com.offcn.springboot02.controller;


import com.offcn.springboot02.pojo.TbGoods;
import com.offcn.springboot02.properties.CompanyProperties;
import com.offcn.springboot02.properties.CourseProperties;
import com.offcn.springboot02.service.TbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    TbGoodsService goodsService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


//    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    @GetMapping("/goods")
    public List<TbGoods> goodsList() {

        redisTemplate.boundValueOps("count1").set(100);
        stringRedisTemplate.boundListOps("count2").leftPush("abc");
        stringRedisTemplate.boundListOps("count3").leftPushAll("cef","qqq","666");

        return goodsService.goodsList();
    }

    @Value("${spring.redis.port}")
    String redisPort;

    @Value("${java0824.stuname1}")
    String stu1;

    @Autowired
    CompanyProperties companyProperties;

    @Autowired
    CourseProperties courseProperties;

    @GetMapping("/demo2")
    public String demo2 () {
        return redisPort + stu1 + "," + companyProperties + "," + courseProperties;
    }

}
