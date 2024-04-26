package com.atguigu.test;

import com.atguigu.ioc_01.CommonComponent;
import com.atguigu.ioc_01.XxxDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/16 12:15
 */
public class SpringIoCTest {

    @Test
    public void testIoC_01(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao bean = applicationContext.getBean(XxxDao.class);
        System.out.println("bean = " + bean);
        Object xxxService = applicationContext.getBean("xxxService");
        System.out.println("xxxService = " + xxxService);
    }
}