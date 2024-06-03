package org.example.fs.demos.handler

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlerKotlinDemo {
    @SentinelResource(
        value = "demo",
        fallback = "fallback",
        fallbackClass = [KotlinHandlerForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
