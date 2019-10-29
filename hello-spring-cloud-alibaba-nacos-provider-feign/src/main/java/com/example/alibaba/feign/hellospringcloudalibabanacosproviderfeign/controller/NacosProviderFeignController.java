package com.example.alibaba.feign.hellospringcloudalibabanacosproviderfeign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenHanLin 2019/10/28
 */
@RestController
public class NacosProviderFeignController {

    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message) {
        return "Hello Nacos Disvovery" + message;
    }
}
