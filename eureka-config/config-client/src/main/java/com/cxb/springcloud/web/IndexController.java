package com.cxb.springcloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 服务器更新信息，热加载
@RefreshScope
public class IndexController {

    @Value("${name}")
    String name;

    @Value("${age}")
    String age;

    @Value("${address}")
    String address;

    @GetMapping(value = "/", produces = "application/json;charset=utf-8")
    public String getInfo(){
        return "info: " + name + " " + age + " " + address;
    }
}
