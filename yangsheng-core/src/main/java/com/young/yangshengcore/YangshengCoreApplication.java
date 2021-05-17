package com.young.yangshengcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication(scanBasePackages = "com.young")
public class YangshengCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangshengCoreApplication.class, args);
    }

}
