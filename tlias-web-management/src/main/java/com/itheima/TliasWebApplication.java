package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.itheima.mapper")
@SpringBootApplication
public class TliasWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasWebApplication.class, args);
    }

}