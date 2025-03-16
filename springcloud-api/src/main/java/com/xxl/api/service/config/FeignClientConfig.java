package com.xxl.api.service.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xxl
 * @date 2025/3/17 0:28
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public feign.Logger.Level getFeignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("xxl", "123456");
    }
}

