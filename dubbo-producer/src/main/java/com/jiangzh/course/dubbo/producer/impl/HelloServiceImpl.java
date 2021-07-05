package com.jiangzh.course.dubbo.producer.impl;

import com.jiangzh.course.dubbo.service.HelloServiceAPI;

public class HelloServiceImpl implements HelloServiceAPI {
    @Override
    public String sayHello(String message) {
        return "Producer response : Hello " +message;
    }
}
