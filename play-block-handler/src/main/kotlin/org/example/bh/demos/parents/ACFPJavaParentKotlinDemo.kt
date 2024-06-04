package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.bh.biz.Greeting
import org.springframework.stereotype.Component

@Component
class ACFPJavaParentKotlinDemo : ACFPJavaParentForKotlin() {
    @SentinelResource(value = "demo", blockHandler = "blockHandler" )
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
