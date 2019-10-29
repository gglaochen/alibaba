package com.example.alibaba.feign.hellospringcloudalibabanacosconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ChenHanLin 2019/10/28
 */
@FeignClient(value = "nacos-provider")
public interface FeignDemoClient {

    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);
}
