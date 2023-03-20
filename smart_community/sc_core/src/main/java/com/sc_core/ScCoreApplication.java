package com.sc_core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@MapperScan({"com.sc_core.dao","com.sc_core.hardware.dao"})
@SpringBootApplication
public class ScCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScCoreApplication.class, args);
    }
}
