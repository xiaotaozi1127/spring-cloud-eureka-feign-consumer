package com.cloud.spring.eureka.feign.consumer.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @GetMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    String hello(@RequestParam String name);

    @GetMapping("/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") int age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
