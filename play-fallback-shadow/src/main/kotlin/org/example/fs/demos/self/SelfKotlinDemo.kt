package org.example.fs.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting.doFallback
import org.example.fs.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class SelfKotlinDemo {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }

    fun fallback(name: String?): String {
        return doFallback(name)
    }
}