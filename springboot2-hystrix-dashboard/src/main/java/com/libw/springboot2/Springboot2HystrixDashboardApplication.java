package com.libw.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class Springboot2HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2HystrixDashboardApplication.class, args);
    }
}
