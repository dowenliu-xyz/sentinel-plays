package org.example.eff.fallback.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.stereotype.Component

//@Component // Enable this will cause bootstrap failure.
@Suppress("unused")
@SentinelResource(value = "demo", fallback = "classFallback")
final class FinalClassWithClassAnnoWithMethodAnnoKotlinDemo {
    @SentinelResource(value = "demo", fallback = "methodFallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
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
