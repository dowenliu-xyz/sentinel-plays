package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

@Component
class FHSHNJavaHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNJavaHandlerForKotlin::class])
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback", fallbackClass = [FHSHNJavaHandlerForKotlin::class])
    override fun second(): Int {
        return Biz.doSecond()
    }
}
