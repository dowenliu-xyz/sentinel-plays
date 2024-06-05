package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method with throwable parameter overridden
 *
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class JavaParentAllLOKotlinDemo2 : JavaParentAllLOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    public override fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
