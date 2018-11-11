package com.libw.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class Springboot2ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2ZuulApplication.class, args);
    }
}
