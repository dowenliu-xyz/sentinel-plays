package org.example.fs.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.fs.biz.Greeting.doFallback
import org.example.fs.biz.Greeting.doGreeting
import org.springframework.stereotype.Component

@Component
class JavaParentAllLOKotlinDemo : JavaParentAllLOForKotlin() {
    @SentinelResource(value = "demo", fallback = "fallback")
    fun greeting(name: String?): String {
        return doGreeting(name)
    }

    override fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }
}