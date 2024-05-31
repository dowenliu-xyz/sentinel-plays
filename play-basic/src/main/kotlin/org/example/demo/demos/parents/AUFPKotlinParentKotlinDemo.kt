package org.example.demo.demos.parents

import org.example.demo.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AUFPKotlinParentKotlinDemo : AUFPKotlinParentForKotlin() {
    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
