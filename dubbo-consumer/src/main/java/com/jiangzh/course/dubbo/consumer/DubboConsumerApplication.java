package com.jiangzh.course.dubbo.consumer;

import com.jiangzh.course.dubbo.service.HelloServiceAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class DubboConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);

        HelloServiceAPI producerService = context.getBean("producerService", HelloServiceAPI.class);

        String message = "I'm Jiangzh";
        System.out.println(producerService.sayHello(message));
    }

}
