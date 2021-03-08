package com.cloudnacosprovider7035;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosProvider7035Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProvider7035Application.class, args);
    }

}
