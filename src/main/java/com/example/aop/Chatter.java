//package com.example.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * Created by SharingWoo on 2017/3/13.
// */
//@Aspect
//@Component
//public class Chatter {
//    @Pointcut("execution(* com.example.bean..*.*(..))")
//    public void thisPouintCut() {
//
//    }
//    @Before(value = "thisPouintCut()")
//    public void doChatter(JoinPoint joinPoint) {
//        System.out.println("chatter");
//    }
//}
