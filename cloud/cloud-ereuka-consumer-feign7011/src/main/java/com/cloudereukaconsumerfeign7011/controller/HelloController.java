package com.cloudereukaconsumerfeign7011.controller;

import com.cloudconsumerfeign.service.ServerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ServerApi serverApi;

    @GetMapping(value="/hello")
    public String test(@RequestParam String name){
        return serverApi.hello(name);
    }

}
