package org.example.bh.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.bh.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        blockHandler = "blockHandler",
        blockHandlerClass = [KotlinHandlersForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
