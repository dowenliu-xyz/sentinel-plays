package org.example.fs.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting
import org.example.fs.biz.Greeting.doFallback
import org.springframework.stereotype.Component

@Component
class KotlinParentLongNOKotlinDemo : KotlinParentLongNOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun fallback(name: String?): String {
        return doFallback(name)
    }
}
