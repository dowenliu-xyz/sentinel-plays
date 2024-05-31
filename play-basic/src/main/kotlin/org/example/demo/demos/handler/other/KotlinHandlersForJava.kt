package org.example.demo.demos.handler.other

import org.example.demo.biz.Greeting.doFallback

@Suppress("unused")
class KotlinHandlersForJava {
    companion object {
        @JvmStatic
        private fun fallback(name: String?, e: Throwable?): String {
            return doFallback(name, e)
        }
    }
}