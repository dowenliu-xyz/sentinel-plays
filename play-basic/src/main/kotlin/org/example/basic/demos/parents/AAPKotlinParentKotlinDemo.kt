package org.example.basic.demos.parents

import org.example.basic.biz.Greeting
import org.example.basic.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AAPKotlinParentKotlinDemo : AAPKotlinParentForKotlin() {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
