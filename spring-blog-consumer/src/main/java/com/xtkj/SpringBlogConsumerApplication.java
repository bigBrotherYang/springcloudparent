package com.xtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBlogConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBlogConsumerApplication.class, args);
    }

}
