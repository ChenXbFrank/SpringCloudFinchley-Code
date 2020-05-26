package com.cxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
// 特么一直把这个忘了，我去
@EnableConfigServer
public class RemoteServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteServerApplication.class, args);
    }

}
