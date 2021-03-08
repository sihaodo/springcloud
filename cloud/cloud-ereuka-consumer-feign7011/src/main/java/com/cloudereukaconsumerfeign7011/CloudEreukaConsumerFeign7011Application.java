package com.cloudereukaconsumerfeign7011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CloudEreukaConsumerFeign7011Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEreukaConsumerFeign7011Application.class, args);
    }

}
