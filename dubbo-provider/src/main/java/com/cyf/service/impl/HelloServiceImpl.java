package com.cyf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cyf.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author by cyf
 * @date 2020/10/4.
 */
@Service
@Component
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
