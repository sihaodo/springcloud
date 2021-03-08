package com.cloudereukaconsumerfeign7011.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "CLOUD-SERVER")
public interface ServerApi {

    @GetMapping(value="/helloServer/{name}")
    public String hello(@PathVariable String name);
}
