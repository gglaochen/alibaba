package com.example.alibaba.feign.hellospringcloudalibabanacosconsumerfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloSpringCloudAlibabaNacosConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudAlibabaNacosConsumerFeignApplication.class, args);
    }

}
