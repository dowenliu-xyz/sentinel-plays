package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.example.demo.demos.handlers.FNSHKotlinHandlerForKotlin
import org.springframework.stereotype.Component

@Component
class FNSHKotlinHandlerKotlinDemo : Demo {
    @SentinelResource
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [FNSHKotlinHandlerForKotlin::class])
    override fun second(): Int {
        return Biz.doSecond()
    }
}
