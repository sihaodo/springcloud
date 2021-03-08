package com.cloudereukaprovider7005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudEreukaProvider7005Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEreukaProvider7005Application.class, args);
    }

}
