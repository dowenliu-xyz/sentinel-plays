package org.example.cd.demos.handlers

import org.example.cd.biz.Greeting

// TODO 类注解时没的提示 shadow
interface KotlinHandlerInterfaceForKotlin {
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
