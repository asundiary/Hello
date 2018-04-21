package com.yang.lab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.yang.lab.dao")
@EnableSwagger2

public class Application {
    public static void main(String[] args)
    {
        org.springframework.boot.SpringApplication.run(Application.class,args);
    }
}
