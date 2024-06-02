package org.example.demo.demos.parents

import org.example.demo.biz.Greeting.doDefaultFallback
import org.example.demo.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AOPJavaParentKotlinDemo : AOPJavaParentForKotlin() {
    override fun greeting(name: String?): String {
        return doGreeting(name)
    }

    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
