package com.cloudereukaconsumer7010.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Hello {

    private static final String REST_URL_PREFIX = "http://CLOUD-SERVER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/hello")
    public String test(@RequestParam String name){
        return restTemplate.getForObject(REST_URL_PREFIX + "/helloServer/"+ name, String.class);
    }

}
