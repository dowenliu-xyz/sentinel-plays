package org.example.cd.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = [JavaHandlerInterfaceForKotlin::class])
class JavaHandlerInterfaceKotlinDemo {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
