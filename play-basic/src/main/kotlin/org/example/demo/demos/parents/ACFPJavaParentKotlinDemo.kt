package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class ACFPJavaParentKotlinDemo : ACFPJavaParentForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback") // TODO 没有提示改 visibility
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
