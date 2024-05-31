package org.example.demo.demos.handlers

import org.example.demo.biz.Greeting

class KotlinHandlersForJava {
    companion object {
        @JvmStatic
        private fun defaultFallback(): String {
            return Greeting.doDefaultFallback()
        }

        @JvmStatic
        private fun defaultFallback(e: Throwable): String {
            return Greeting.doDefaultFallback(e)
        }
    }
}
