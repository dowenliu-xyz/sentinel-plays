package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.example.demo.demos.handlers.FHSHNKotlinHandlerForJava
import org.springframework.stereotype.Component

@Component
class FHSHNKotlinHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNKotlinHandlerForJava::class])
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNKotlinHandlerForJava::class])
    override fun second(): Int {
        return Biz.doSecond()
    }
}
