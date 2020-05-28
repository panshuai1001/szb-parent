package com.itheima.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lenovo on 2020/5/24.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplicatioin {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicatioin.class);
    }
}
