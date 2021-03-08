package com.cloudzookeeperprovider7020.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServer {

    private String port = "7020";

    @GetMapping(value="/helloServer/{name}")
    public String hello(@PathVariable String name) throws Exception{
        //Thread.sleep(2000);
        return "hello :"+ name + port;
    }

    @GetMapping(value="/provider/testError")
    public String testError() throws Exception{
        int a = 10/0;
        return "ok";
    }
}
