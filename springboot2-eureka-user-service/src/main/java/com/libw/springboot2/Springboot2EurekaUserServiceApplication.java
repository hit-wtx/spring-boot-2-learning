package com.libw.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springboot2EurekaUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2EurekaUserServiceApplication.class, args);
    }
}
