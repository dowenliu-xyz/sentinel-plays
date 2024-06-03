package org.example.rc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.rc.biz.Biz
import org.example.rc.biz.Demo
import org.springframework.stereotype.Component

@Component
class FSSHJavaHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun first(): String {
        return Biz.doFirst()
    }

    private fun fallback(): String {
        return Biz.doFirstFallback()
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [FSSHJavaHandlerForKotlin::class]
    )
    override fun second(): Int {
        return Biz.doSecond()
    }
}
