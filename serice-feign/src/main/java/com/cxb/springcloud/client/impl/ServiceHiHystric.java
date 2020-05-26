package com.cxb.springcloud.client.impl;

import com.cxb.springcloud.client.HelloClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystric implements HelloClient {

    @Override
    public String hi(String name) {
        return "service is error,sorry "+name;
    }
}
