package org.example.basic.demos.parents

import org.example.basic.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AUPJavaParentKotlinDemo2 : AUPJavaParentForKotlin() {
    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
