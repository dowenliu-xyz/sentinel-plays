package org.example.df.demos.handler.other

import org.example.df.biz.Greeting.doDefaultFallback

@Suppress("unused")
interface KotlinHandlerInterfaceForKotlin {
    companion object {
        @JvmStatic
        fun defaultFallback(e: Throwable?): String {
            return doDefaultFallback(e)
        }
    }
}