package com.offcn.springboot02.service.impl;

import com.offcn.springboot02.pojo.TbGoods;
import com.offcn.springboot02.service.TbGoodsService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TbGoodsServiceImpl implements TbGoodsService {

    @Override
    public List<TbGoods> goodsList() {
        TbGoods tbGoods = new TbGoods();
        tbGoods.setId(101L);
        tbGoods.setName("华为");
        List<TbGoods> tbGoods1 = Arrays.asList(tbGoods);
        return tbGoods1;
    }
}
