package com.libw.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springboot2EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2EurekaApplication.class, args);
    }
}
