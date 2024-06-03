package org.example.df.demos.handler.other

import org.example.df.biz.Greeting.doDefaultFallback

@Suppress("unused")
class KotlinHandlersForKotlin {
    companion object {
        @JvmStatic
        private fun defaultFallback(e: Throwable?): String {
            return doDefaultFallback(e)
        }
    }
}