package com.cloudereukaserver7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudEreukaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEreukaServer7001Application.class, args);
    }

}
