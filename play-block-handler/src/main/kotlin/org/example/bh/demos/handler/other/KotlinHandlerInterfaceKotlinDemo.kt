package org.example.bh.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.bh.biz.Greeting
import org.springframework.stereotype.Component

@Component
class KotlinHandlerInterfaceKotlinDemo {
    @SentinelResource(
        value = "demo",
        blockHandler = "blockHandle",
        blockHandlerClass = [KotlinHandlerInterfaceForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
