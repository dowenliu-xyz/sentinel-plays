package org.example.cd.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = [JavaHandlersForKotlin::class])
class JavaHandlersKotlinDemo {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
