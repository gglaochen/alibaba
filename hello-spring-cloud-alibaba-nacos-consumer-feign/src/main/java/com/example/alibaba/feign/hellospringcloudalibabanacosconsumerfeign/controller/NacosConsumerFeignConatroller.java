package com.example.alibaba.feign.hellospringcloudalibabanacosconsumerfeign.controller;

import com.example.alibaba.feign.hellospringcloudalibabanacosconsumerfeign.service.FeignDemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenHanLin 2019/10/28
 */
@RestController
public class NacosConsumerFeignConatroller {

    @Autowired
    private FeignDemoClient FeignService;

    @GetMapping(value = "/test/hi")
    public String test() {
        return FeignService.test("Hi Feign");
    }
}
