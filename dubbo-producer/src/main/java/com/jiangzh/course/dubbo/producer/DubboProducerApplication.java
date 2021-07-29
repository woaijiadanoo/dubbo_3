package com.jiangzh.course.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class DubboProducerApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(DubboProducerApplication.class, args);

        System.in.read();
    }

}
