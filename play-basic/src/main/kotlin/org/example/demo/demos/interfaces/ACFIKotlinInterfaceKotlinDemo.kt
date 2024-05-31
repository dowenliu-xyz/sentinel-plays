package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

/**
 * case impl: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but CAN NOT find fallback method.
 * TODO 现在插件把接口上的方法也找出来了，画蛇添足。
 */
@Component
class ACFIKotlinInterfaceKotlinDemo : ACFIKotlinInterfaceForKotlin {
    @SentinelResource(value = "demo", fallback = "fallback")
    override fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
