package com.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/3/15 19:58
 */
public class JdbcTemplateTest {

    public void testForJava(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///studb");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(dataSource);

    }


    public void testForIoC(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);

        String sql = "insert into students (name, gender, age, class) values (?,?,?,?) ";

        int rows = jdbcTemplate.update(sql, "二狗子", "男", 18, "三年二班");
        System.out.println("rows = " + rows);

        sql = "select * from students where id = ?;";

        jdbcTemplate.queryForObject(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {



                return null;
            }
        }, 1);

    }

}

































































