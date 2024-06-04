package org.example.cd.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.cd.biz.Greeting
import org.springframework.stereotype.Component

// TODO 类上注解没有提示修改 visibility
@Component
@SentinelResource(defaultFallback = "defaultFallback", fallbackClass = [JavaHandlerInterfaceForKotlin::class])
class JavaHandlerInterfaceKotlinDemo {
    // TODO 接口的静态 handler 方法 visibility 不能修改为 protected
    @SentinelResource(value = "demo",
        defaultFallback = "defaultFallback",
        fallbackClass = [JavaHandlerInterfaceForKotlin::class]
    ) // TODO 设置到方法上，修改一个方法的 visibility 后，另一个方法不提示修改 visibility 了
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
