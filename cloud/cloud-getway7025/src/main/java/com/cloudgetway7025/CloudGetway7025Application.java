package com.cloudgetway7025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGetway7025Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudGetway7025Application.class, args);
    }

}
