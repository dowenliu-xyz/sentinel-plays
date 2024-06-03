package org.example.oc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignCloudApplication.class, args);
    }
}
