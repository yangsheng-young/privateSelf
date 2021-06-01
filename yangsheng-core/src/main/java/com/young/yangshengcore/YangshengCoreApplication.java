package com.young.yangshengcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class},scanBasePackages = "com.young")
public class YangshengCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangshengCoreApplication.class, args);
    }

}
