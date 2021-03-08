package com.cloudnacosconsumer7030.controller;

import com.cloudnacosconsumer7030.service.ServerApi;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@DefaultProperties(defaultFallback="defaultMethod"
        ,commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
public class HelloController {

    @Autowired
    private ServerApi serverApi;

    @Value("${config}")
    private String config;

    @GetMapping(value="/config")
    @HystrixCommand
    public String config(){
        return config;
    }

    @GetMapping(value="/hello")
    public String hello(@RequestParam String name) throws Exception{
        return serverApi.hello(name);
    }

    @GetMapping(value="/testError")
    @HystrixCommand
    public String testError() throws Exception{
        return serverApi.testError();
    }

    private String defaultMethod(){
        return "默认 ! lalalalala";
    }

}
