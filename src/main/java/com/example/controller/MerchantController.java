package com.example.controller;

import com.example.mapper.bs.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SharingWoo on 2017/3/16.
 */
@RestController
@RequestMapping(value = "merchant")
public class MerchantController {
//    @Autowired
//    private MerchantMapper mapper;

    @RequestMapping("getCount")
    public void getCount() {
//        System.out.println(mapper.getCount());
    }
}
