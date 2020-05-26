package com.cxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RemoteClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteClientApplication.class, args);
    }

}
