package com.example.bean.impl;

import com.example.bean.Business;
import org.springframework.stereotype.Component;

/**
 * Created by SharingWoo on 2017/3/13.
 */
@Component
public class DoHomework implements Business {
    @Override
    public void doBusiness() {
        System.out.println("i should do my homework.");
    }
}
