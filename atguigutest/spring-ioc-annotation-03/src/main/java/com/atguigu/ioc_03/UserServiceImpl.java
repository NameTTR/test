package com.atguigu.ioc_03;

import org.springframework.stereotype.Service;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/16 13:31
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String show() {
        return "UserServiceImpl show()";

    }
}