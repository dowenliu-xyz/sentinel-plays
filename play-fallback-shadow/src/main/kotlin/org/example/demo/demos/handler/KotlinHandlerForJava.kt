package org.example.demo.demos.handler

import org.example.demo.biz.Greeting

class KotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(name: String?, e: Throwable?): String {
            return Greeting.doFallback(name, e)
        }

        @JvmStatic
        private fun fallback(name: String?): String {
            return Greeting.doFallback(name)
        }
    }
}
