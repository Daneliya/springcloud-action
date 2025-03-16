package com.xxl.springboot.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient                    // 启用Eureka客户端
@EnableDiscoveryClient
public class SpringbootDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDeptApplication.class, args);
    }

}
