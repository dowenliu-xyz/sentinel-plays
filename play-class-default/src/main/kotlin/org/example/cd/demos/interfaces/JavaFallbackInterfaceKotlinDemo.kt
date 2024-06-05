package org.example.cd.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: interface with default fallback method
 * <br></br>
 * Aspect takes effect, but the defaultFallback method can not be found.
 */
@Component
@SentinelResource(defaultFallback = "defaultFallback")
class JavaFallbackInterfaceKotlinDemo : JavaFallbackInterfaceForKotlin {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
