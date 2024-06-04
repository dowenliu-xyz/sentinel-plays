package org.example.basic.demos.handler.other

import org.example.basic.biz.Greeting

interface KotlinHandlerInterfaceForKotlin {
    companion object {
        @JvmStatic
        fun fallback(name: String, e: Throwable): String {
            return Greeting.doFallback(name, e)
        }
    }
}
