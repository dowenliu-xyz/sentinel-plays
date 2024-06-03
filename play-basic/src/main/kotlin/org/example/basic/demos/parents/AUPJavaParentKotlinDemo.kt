package org.example.basic.demos.parents

import org.example.basic.biz.Greeting.doFallback
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@Primary
class AUPJavaParentKotlinDemo : AUPJavaParentForKotlin() {
    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
