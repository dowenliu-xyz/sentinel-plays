package org.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DefaultFallbackApplication

fun main(args: Array<String>) {
    runApplication<DefaultFallbackApplication>(*args)
}