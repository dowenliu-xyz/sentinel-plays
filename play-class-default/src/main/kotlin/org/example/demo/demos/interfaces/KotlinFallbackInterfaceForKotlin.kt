package org.example.demo.demos.interfaces

import org.example.demo.biz.Greeting

interface KotlinFallbackInterfaceForKotlin {
    fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    fun defaultFallback(e: Throwable?): String {
        return Greeting.doDefaultFallback(e)
    }
}
