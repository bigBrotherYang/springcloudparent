package com.xtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBlogProducer19998Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBlogProducer19998Application.class, args);
    }

}
