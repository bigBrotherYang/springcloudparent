package com.xtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBlogProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBlogProducerApplication.class, args);
    }

}
