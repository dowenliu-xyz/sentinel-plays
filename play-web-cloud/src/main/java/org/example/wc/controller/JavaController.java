package org.example.wc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
    @GetMapping("/java/hello")
    public String hello() {
        return "Hello, Java!";
    }
}
