package com.libw.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
@EnableFeignClients
//@EnableHystrixDashboard
public class Springboot2FeignApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2FeignApiApplication.class, args);
    }
}
