package org.example.cd.demos.handlers

import org.example.cd.biz.Greeting

interface KotlinHandlerInterfaceForJava {
    companion object {
        @JvmStatic
        fun defaultFallback(): String {
            return Greeting.doDefaultFallback()
        }

        @JvmStatic
        fun defaultFallback(e: Throwable): String {
            return Greeting.doDefaultFallback(e)
        }
    }
}
