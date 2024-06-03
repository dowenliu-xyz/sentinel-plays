package org.example.df.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.df.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class ACFPKotlinParentKotlinDemo : ACFPKotlinParentForKotlin() {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
