package com.cloudereukaprovider7005.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServer {

    @GetMapping(value="/helloServer/{name}")
    public String hello(@PathVariable String name){
        return "hello "+ name;
    }
}
