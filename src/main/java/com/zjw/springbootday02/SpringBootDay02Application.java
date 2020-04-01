package com.zjw.springbootday02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjw.springbootday02.dao")
public class SpringBootDay02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDay02Application.class, args);
    }
}
