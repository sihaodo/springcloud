package com.cloudnacosprovider7035.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServer {

    @Value("${server.port}")
    private String port;

    @GetMapping(value="/helloServer/{name}")
    public String hello(@PathVariable String name) throws Exception{
        Thread.sleep(6000);
        return "hello :"+ name + port;
    }
}
