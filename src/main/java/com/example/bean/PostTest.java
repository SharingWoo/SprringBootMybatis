package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by SharingWoo on 2017/3/15.
 */
public class PostTest implements BeanFactoryPostProcessor,BeanPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
                System.out.println("do the function postProcessBeanFactory.");
        BeanDefinition bd = beanFactory.getBeanDefinition("pojo");
        System.out.println("属性值============" + bd.getPropertyValues().toString());
        MutablePropertyValues pv =  bd.getPropertyValues();
        if (pv.contains("name")) {
            pv.addPropertyValue("name", "把备注信息修改一下");
        }
        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor，对象" + beanName + "调用初始化方法之前的数据： " + bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor，对象" + beanName + "调用初始化方法之后的数据：" + bean.toString());
        return bean;
    }
}
