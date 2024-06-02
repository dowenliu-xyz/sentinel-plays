package org.example.demo.demos.parents

import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AAPKotlinParentKotlinDemo : AAPKotlinParentForKotlin() {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
