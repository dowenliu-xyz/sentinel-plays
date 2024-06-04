package org.example.basic.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlerInterfaceKotlinDemo {
    @SentinelResource(value = "demo", fallback = "fallback", fallbackClass = [KotlinHandlerInterfaceForKotlin::class])
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
