package com.cxb.springcloud.web;

import com.cxb.springcloud.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloClient helloClient;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloClient.hi( name );
    }

}
