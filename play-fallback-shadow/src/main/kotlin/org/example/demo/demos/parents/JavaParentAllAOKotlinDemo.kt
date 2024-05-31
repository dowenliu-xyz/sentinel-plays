package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting.doFallback
import org.example.demo.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class JavaParentAllAOKotlinDemo : JavaParentAllAOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    override fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }

    override fun fallback(name: String?): String {
        return doFallback(name)
    }
}