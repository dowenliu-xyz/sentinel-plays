package org.example.demo.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(defaultFallback = "defaultFallback")
class SelfKotlinDemo {
    @SentinelResource(value = "greeting")
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
