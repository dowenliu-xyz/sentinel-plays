package org.example.cd.demos.interfaces

import org.example.cd.biz.Greeting

interface KotlinFallbackInterfaceForJava {
    fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    fun defaultFallback(e: Throwable?): String {
        return Greeting.doDefaultFallback(e)
    }
}
