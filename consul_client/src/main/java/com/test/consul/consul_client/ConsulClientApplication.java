package com.test.consul.consul_client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.test.consul.consul_client")
public class ConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class, args);
    }

}
