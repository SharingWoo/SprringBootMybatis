package com.example.bean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created by SharingWoo on 2017/3/14.
 */

public class Pojo implements InitializingBean {
    public Pojo() {
        System.out.println("construct");
    }

    private String name;

    private String address;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
    @PostConstruct
    public void myInit() {
        System.out.println("postConstruct");
    }
}
