package com.clg.usercentre;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clg.usercentre.mapper")
public class UserCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCentreApplication.class, args);
    }

}
