package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class ACFPKotlinParentKotlinDemo : ACFPKotlinParentForKotlin() {
    @SentinelResource(value = "demo", blockHandler = "blockHandler")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
