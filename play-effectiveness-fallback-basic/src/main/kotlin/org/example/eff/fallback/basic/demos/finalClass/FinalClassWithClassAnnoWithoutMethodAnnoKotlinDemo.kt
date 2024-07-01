package org.example.eff.fallback.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@SentinelResource(value = "demo", fallback = "classFallback")
final class FinalClassWithClassAnnoWithoutMethodAnnoKotlinDemo {
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }
}
