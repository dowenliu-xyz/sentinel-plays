package org.example.cd.demos.handlers

import org.example.cd.biz.Greeting

// TODO 类注解时没的提示 shadow
class KotlinHandlersForKotlin {
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
