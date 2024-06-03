package org.example.df.demos.parents

import org.example.df.biz.Greeting.doDefaultFallback
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@Primary
class AUPJavaParentKotlinDemo : AUPJavaParentForKotlin() {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
