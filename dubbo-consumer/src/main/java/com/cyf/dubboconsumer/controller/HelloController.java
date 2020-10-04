package com.cyf.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyf.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by cyf
 * @date 2020/10/4.
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        String hello = helloService.sayHello("cyf");
        System.out.println(helloService.sayHello("world"));
        return  hello;
    }
}
