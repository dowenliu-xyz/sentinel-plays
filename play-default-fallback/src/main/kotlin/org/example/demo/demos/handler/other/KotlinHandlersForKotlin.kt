package org.example.demo.demos.handler.other

import org.example.demo.biz.Greeting.doDefaultFallback

@Suppress("unused")
class KotlinHandlersForKotlin {
    companion object {
        @JvmStatic
        private fun defaultFallback(e: Throwable?): String {
            return doDefaultFallback(e)
        }
    }
}