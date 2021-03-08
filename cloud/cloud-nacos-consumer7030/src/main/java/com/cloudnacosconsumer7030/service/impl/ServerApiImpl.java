package com.cloudnacosconsumer7030.service.impl;

import com.cloudnacosconsumer7030.service.ServerApi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ServerApiImpl implements ServerApi {

    public String hello(String name) throws Exception{
        return "默认 ! lalalalala  back";
    }

    public String testError() throws Exception{
        return "默认 ! lalalalala  back";
    }
}
