package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

@Component
class JavaParentShortNOKotlinDemo : JavaParentShortNOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun fallback(name: String?, e: Throwable?): String {
        return Greeting.doFallback(name, e)
    }
}
