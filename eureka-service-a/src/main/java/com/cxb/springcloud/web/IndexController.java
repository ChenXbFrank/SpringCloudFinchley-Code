package com.cxb.springcloud.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getInfo")
    public String get() {
        return "service a";
    }

    @RequestMapping("/call")
    public String callService(){
        return restTemplate.getForObject("http://EUREKA-SERVICE-B/getInfo", String.class);
    }

}
