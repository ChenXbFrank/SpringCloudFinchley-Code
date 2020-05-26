package com.cxb.springcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getInfo")
    public String get() {
        return "service b";
    }

    @RequestMapping("/call")
    public String callService(){
        return restTemplate.getForObject("http://EUREKA-SERVICE-A/getInfo",String.class);
    }


}
