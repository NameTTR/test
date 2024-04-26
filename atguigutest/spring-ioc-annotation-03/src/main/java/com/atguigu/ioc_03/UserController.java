package com.atguigu.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/16 13:31
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void show(){

    }
}