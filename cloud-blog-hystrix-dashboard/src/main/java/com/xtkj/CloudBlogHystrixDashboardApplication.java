package com.xtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class CloudBlogHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBlogHystrixDashboardApplication.class, args);
    }

}
