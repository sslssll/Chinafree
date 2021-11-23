package com.chinafree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.chinafree.*")
@SpringBootApplication
public class ChinalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinalanceApplication.class, args);
    }

}
