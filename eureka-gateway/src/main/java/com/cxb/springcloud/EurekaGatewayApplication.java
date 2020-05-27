package com.cxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayApplication.class, args);
    }

    /**
     * 使用了一个RouteLocatorBuilder的bean去创建路由，除了创建路由RouteLocatorBuilder
     * 可以让你添加各种predicates和filters，predicates断言的意思，顾名思义就是根据
     * 具体的请求的规则，由具体的route去处理，filters是各种过滤器，用来对请求做各种判断和修改。
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        // 该filter会将请求添加一个header,key为hello，value为world。
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://localhost:8770/hi"))
                .build();
    }

}
