package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/17 0:10
 */
@Configuration
@ComponentScan("com.atguigu")
@EnableAspectJAutoProxy
public class JavaConfig {

}