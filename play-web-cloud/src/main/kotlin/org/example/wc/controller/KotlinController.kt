package org.example.wc.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController {
    @GetMapping("/kotlin/hello")
    fun hello(): String {
        return "Hello, Kotlin!"
    }
}
