package org.example.demo.demos.parents

import org.example.demo.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AUFPJavaParentKotlinDemo : AUFPJavaParentForKotlin() {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
