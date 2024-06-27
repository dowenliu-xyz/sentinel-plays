package org.example.eff.fallback.basic.demos.single

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
class SingleWithoutClassAnnoWithMethodAnnoKotlinDemo {
    @SentinelResource(value = "demo", fallback = "methodFallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun methodFallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }

    fun methodFallback(name: String?): String {
        return Greeting.doFallback(name)
    }
}
