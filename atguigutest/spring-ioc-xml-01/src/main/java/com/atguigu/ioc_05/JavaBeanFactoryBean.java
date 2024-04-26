package com.atguigu.ioc_05;


import org.springframework.beans.factory.FactoryBean;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/15 13:10
 */
public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {


    @Override
    public JavaBean getObject() throws Exception {
        JavaBean javaBean = new JavaBean();
        return javaBean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}