package com.example.bean.impl;

import com.example.bean.Business;
import com.example.bean.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by SharingWoo on 2017/3/13.
 */
@Component
public class Student implements Character {
    @Autowired
//    @Qualifier(value = "doHomework")
    private Business business;

    @Override
    public void doAction() {
        business.doBusiness();
    }
}
