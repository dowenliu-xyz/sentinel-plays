package org.example.df.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        defaultFallback = "defaultFallback",
        fallbackClass = [JavaHandlersForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
