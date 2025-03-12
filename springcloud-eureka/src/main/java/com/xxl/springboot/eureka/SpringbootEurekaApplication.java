package com.xxl.springboot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer                    // 启用Eureka服务
public class SpringbootEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaApplication.class, args);
    }

}
