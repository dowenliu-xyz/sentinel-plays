package org.example.demo.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaHandlersKotlinDemo {
    @SentinelResource(
        value = "demo",
        blockHandler = "blockHandler",
        blockHandlerClass = [JavaHandlersForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
