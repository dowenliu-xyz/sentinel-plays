package org.example.df.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlerInterfaceKotlinDemo {
    @SentinelResource(
        value = "demo",
        defaultFallback = "defaultFallback",
        fallbackClass = [KotlinHandlerInterfaceForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
