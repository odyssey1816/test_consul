package com.test.consul.consul_server;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.test.consul.consul_server")
public class ConsulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulServerApplication.class, args);
    }

}
