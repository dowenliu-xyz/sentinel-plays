package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: interface with default fallback method
 * <br></br>
 * Aspect takes effect, but the defaultFallback method can not be found.
 */
@Component
@SentinelResource(defaultFallback = "defaultFallback") // TODO 不应该解析出 接口上的方法。画蛇添足。
class KotlinFallbackInterfaceKotlinDemo : KotlinFallbackInterfaceForKotlin {
    @SentinelResource(value = "demo") // TODO 方法设置 defaultFallback 后也不应该解析出接口上的方法。画蛇添足
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
