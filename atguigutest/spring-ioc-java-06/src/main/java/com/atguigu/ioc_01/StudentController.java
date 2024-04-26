package com.atguigu.ioc_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/16 14:17
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
}