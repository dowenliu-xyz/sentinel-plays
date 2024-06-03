package org.example.fs.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class KotlinParentAllNOKotlinDemo : KotlinParentAllNOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }
}