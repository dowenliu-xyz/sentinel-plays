package org.example.basic.demos.parents

import org.example.basic.biz.Greeting.doFallback
import org.example.basic.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AOPJavaParentKotlinDemo : AOPJavaParentForKotlin() {
    override fun greeting(name: String?): String {
        return doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
