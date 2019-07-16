package com.cloud.spring.eureka.feign.consumer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @GetMapping("/feign-consumer")
    public String helloConsumer(){
        return helloService.hello();
    }

    @GetMapping("/feign-consumer1")
    public String hello1Consumer(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("hui")).append("\n");
        sb.append(helloService.hello("hui", 11)).append("\n");
        sb.append(helloService.hello(new User("hui", 12))).append("\n");
        return sb.toString();
    }
}
