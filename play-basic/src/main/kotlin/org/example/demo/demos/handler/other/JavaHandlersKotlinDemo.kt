package org.example.demo.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        fallback = "fallback",
        fallbackClass = [JavaHandlersForKotlin::class]
    ) // TODO 现在插件没有提供修正 visibility
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
