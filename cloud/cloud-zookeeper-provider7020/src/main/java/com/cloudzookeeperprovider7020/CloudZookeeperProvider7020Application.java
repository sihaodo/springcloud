package com.cloudzookeeperprovider7020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudZookeeperProvider7020Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZookeeperProvider7020Application.class, args);
    }

}
