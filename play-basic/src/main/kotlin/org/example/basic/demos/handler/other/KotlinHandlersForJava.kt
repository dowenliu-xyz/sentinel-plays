package org.example.basic.demos.handler.other

import org.example.basic.biz.Greeting.doFallback

@Suppress("unused")
class KotlinHandlersForJava {
    companion object {
        @JvmStatic
        private fun fallback(name: String?, e: Throwable?): String {
            return doFallback(name, e)
        }
    }
}