package org.example.df.demos.parents

import org.example.df.biz.Greeting
import org.example.df.biz.Greeting.doDefaultFallback
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
