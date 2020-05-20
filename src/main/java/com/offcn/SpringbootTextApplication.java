package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.offcn.mapper")
public class SpringbootTextApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTextApplication.class, args);
    }

}
