package org.example.df.demos.parents

import org.example.df.biz.Greeting.doDefaultFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AUFPJavaParentKotlinDemo : AUFPJavaParentForKotlin() {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
