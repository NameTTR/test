package com.atguigu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/17 0:15
 */
@Component
@Aspect
public class LogAdvice {

    @Before("execution(* com.atguigu.service.impl.*.*(..))")
    public void start(){
        System.out.println("方法开始");
    }

    @After("execution(* com.atguigu.service.impl.*.*(..))")
    public void after(){
        System.out.println("jiesu");
    }

    @AfterThrowing("execution(* com.atguigu.service.impl.*.*(..))")
    public void error(){
        System.out.println("cuowu");
    }

}