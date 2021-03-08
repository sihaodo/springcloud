package com.cloudnacosconsumer7030.service;

import com.cloudnacosconsumer7030.service.impl.ServerApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-nacos-provider",fallback = ServerApiImpl.class)
public interface ServerApi {

    @GetMapping(value="/helloServer/{name}")
    String hello(@PathVariable(value = "name") String name) throws Exception;

    @GetMapping(value="/provider/testError")
    String testError() throws Exception;
}
