package com.atguigu.test;

import com.atguigu.ioc_03.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/14 23:20
 */
public class SpringioCTest {

    public void creatIoC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
    }

    @Test
    public void getBeanFormIoC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
//        HappyComponent happyComponent = (HappyComponent)applicationContext.getBean("happyComponent");
        HappyComponent happyComponent = applicationContext.getBean(HappyComponent.class);
        happyComponent.doWork();
    }
}