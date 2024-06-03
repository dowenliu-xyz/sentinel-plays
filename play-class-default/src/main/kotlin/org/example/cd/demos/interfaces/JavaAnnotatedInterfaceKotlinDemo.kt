package org.example.cd.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on interface class
 * <br></br>
 * Aspect DOES NOT take effect, defaultFallback does not take effect.
 */
@Component
class JavaAnnotatedInterfaceKotlinDemo : JavaAnnotatedInterfaceForKotlin {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun defaultFallback(): String {
        return Greeting.doDefaultFallback()
    }

    private fun defaultFallback(e: Throwable): String {
        return Greeting.doDefaultFallback(e)
    }
}
