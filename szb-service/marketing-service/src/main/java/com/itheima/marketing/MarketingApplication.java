package com.itheima.marketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lenovo on 2020/5/24.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.itheima")
public class MarketingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarketingApplication.class);
    }
}
