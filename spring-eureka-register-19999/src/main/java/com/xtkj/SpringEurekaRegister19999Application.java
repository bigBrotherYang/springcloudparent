package com.xtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaRegister19999Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaRegister19999Application.class, args);
    }

}
