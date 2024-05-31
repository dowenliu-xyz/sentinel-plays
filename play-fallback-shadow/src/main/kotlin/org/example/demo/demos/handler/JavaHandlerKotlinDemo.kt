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
    ) // TODO 没有提示修正 visibility
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
