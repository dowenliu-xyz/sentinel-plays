package org.example.eff.fallback.basic.demos.staticMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", fallback = "classFallback")
class StaticMethodWithClassAnnoWithMethodAnnoKotlinDemo {
    companion object {
        @SentinelResource(value = "demo", fallback = "methodFallback")
        @JvmStatic
        fun greeting(name: String?): String {
            return Greeting.doGreeting(name)
        }
    }

    @Suppress("unused")
    fun classFallback(name: String?, e: Throwable?): String {
        return ""
    }

    fun methodFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun methodFallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
