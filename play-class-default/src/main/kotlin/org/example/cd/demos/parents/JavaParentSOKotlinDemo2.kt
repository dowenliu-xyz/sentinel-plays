package org.example.cd.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, defaultFallback method without throwable parameter  overridden
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class JavaParentSOKotlinDemo2 : JavaParentSOForKotlin() {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    public override fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    private fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
