package com.cxb.springcloud.client;

import com.cxb.springcloud.client.impl.ServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  value是服务名称
 */
@FeignClient(value = "EUREKA-SERVICE",fallback = ServiceHiHystric.class)
public interface HelloClient {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
