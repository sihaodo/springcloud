package com.cloudzookeeperconsumer7015;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudZookeeperConsumer7015Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZookeeperConsumer7015Application.class, args);
    }

}
