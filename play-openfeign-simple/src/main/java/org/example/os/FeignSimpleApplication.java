package org.example.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignSimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignSimpleApplication.class, args);
    }
}
