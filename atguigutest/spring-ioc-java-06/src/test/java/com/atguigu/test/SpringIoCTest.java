package com.atguigu.test;

import com.atguigu.config.JavaConfigration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/16 14:26
 */
public class SpringIoCTest {

    public void test(){
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfigration.class);


    }
}