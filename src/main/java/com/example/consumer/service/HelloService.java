package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value ="provider")
public interface  HelloService {
    @RequestMapping("/getDate")
    String hello();
}