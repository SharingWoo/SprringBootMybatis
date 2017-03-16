package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by SharingWoo on 2017/3/13.
 */
@Component
public class BeanTest implements BeanFactoryPostProcessor{

    private String name;

    public BeanTest(){
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    public String getName() {
        return name;
    }

    public void setName(@Value("wushuning") String name) {
        System.out.println("set name +++++++++++++++++++++++++");
        this.name = name;
    }

    @PostConstruct
    public void myInit() {
        System.out.println("My init function ++++++++++++++++++++++++++++++++++++++++++");
    }

    @PreDestroy
    public void myDestroyy() {
        System.out.println("My destroy function ++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("do the function postProcessBeanFactory.");
//        BeanDefinition bd = beanFactory.getBeanDefinition("pojo");
//        System.out.println("属性值============" + bd.getPropertyValues().toString());
//        MutablePropertyValues pv =  bd.getPropertyValues();
//        if (pv.contains("name")) {
//            pv.addPropertyValue("name", "把备注信息修改一下");
//        }
//        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }
}
