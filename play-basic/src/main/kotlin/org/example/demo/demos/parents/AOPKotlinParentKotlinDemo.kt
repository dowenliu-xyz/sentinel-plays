package org.example.demo.demos.parents

import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AOPKotlinParentKotlinDemo : AOPKotlinParentForKotlin() {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
