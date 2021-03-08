package com.cloudereukaconsumer7010;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudEreukaConsumer7010Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEreukaConsumer7010Application.class, args);
    }

}
