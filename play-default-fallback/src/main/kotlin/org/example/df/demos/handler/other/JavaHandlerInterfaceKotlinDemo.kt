package org.example.df.demos.handler.other

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaHandlerInterfaceKotlinDemo {
    // TODO 接口的静态 handler 方法 visibility 不能修改为 protected
    @SentinelResource(
        value = "demo",
        defaultFallback = "defaultFallback",
        fallbackClass = [JavaHandlerInterfaceForKotlin::class]
    )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
