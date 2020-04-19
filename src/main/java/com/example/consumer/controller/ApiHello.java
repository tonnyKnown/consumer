package com.example.consumer.controller;

import com.example.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiHello {
    @Autowired
    HelloService helloService;

    @RequestMapping("/feign/hello")
    public String hello(HttpServletRequest request){
        String name = request.getParameter("name");
//        String age = request.getParameter("age");
        Map<String, String> map = new HashMap<>();
        map.put("name",name);
//        map.put("age",age);
        // 调用多个服务
        return helloService.hello();
    }
}
