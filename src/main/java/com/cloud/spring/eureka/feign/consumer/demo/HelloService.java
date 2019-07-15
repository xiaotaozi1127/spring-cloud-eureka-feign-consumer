package com.cloud.spring.eureka.feign.consumer.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
