package org.example.demo.demos.handler

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaHandlerKotlinDemo {
    @SentinelResource(
        value = "demo",
        fallback = "fallback",
        fallbackClass = [JavaHandlerForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
