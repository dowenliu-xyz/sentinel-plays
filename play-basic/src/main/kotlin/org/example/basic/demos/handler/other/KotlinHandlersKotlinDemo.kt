package org.example.basic.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        fallback = "fallback",
        fallbackClass = [KotlinHandlersForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
