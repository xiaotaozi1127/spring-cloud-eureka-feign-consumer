package com.cloud.spring.eureka.feign.consumer.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @GetMapping("/hello")
    String hello();

    @GetMapping("hello1")
    String hello1(@RequestParam("name") String name);
}
