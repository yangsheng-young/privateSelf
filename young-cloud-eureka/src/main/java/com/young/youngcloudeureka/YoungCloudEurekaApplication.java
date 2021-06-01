package com.young.youngcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = "com.young")
public class YoungCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungCloudEurekaApplication.class, args);
    }

}
