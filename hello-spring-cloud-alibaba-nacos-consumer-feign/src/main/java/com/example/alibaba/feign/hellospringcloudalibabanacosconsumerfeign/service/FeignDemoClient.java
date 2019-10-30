package com.example.alibaba.feign.hellospringcloudalibabanacosconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ChenHanLin 2019/10/28
 */
@FeignClient(value = "nacos-provider")
public interface FeignDemoClient {

    /**
     * 此处声明的接口名无需和提供方接口名一致
     * @param message
     * @return
     */
    @GetMapping(value = "/test/{message}")
    String test1(@PathVariable("message") String message);
}
