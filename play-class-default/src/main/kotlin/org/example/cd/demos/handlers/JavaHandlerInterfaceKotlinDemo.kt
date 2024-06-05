package org.example.cd.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

// TODO 类上注解没有提示修改 visibility
@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = [JavaHandlerInterfaceForKotlin::class])
class JavaHandlerInterfaceKotlinDemo {
    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
