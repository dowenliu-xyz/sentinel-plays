package org.example.demo.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        defaultFallback = "defaultFallback",
        fallbackClass = [KotlinHandlersForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
