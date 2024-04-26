package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/17 0:27
 */
@Component
@Aspect
public class MyAdvice {

    @Before("execution(* com..impl.*.*(..) )")
    public void before(JoinPoint joinPoint){


    }
    @AfterReturning("execution(* com..impl.*.*(..) )")
    public void afterReturning(JoinPoint joinPoint){

    }
    @After("execution(* com..impl.*.*(..) )")
    public void after(JoinPoint joinPoint){

    }
    @AfterThrowing("execution(* com..impl.*.*(..) )")
    public void error(JoinPoint joinPoint){

    }

}



















