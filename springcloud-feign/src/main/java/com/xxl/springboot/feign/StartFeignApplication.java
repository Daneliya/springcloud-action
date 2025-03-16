package com.xxl.springboot.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.xxl.api.service"})    // 定义Feign接口扫描包
public class StartFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartFeignApplication.class, args);
    }

}
