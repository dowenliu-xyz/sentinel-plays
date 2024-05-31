package org.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController {
    @GetMapping("/kotlin/hello")
    fun hello(): String {
        return "Hello, Kotlin!"
    }
}
