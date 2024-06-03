package org.example.rc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.rc.biz.Biz
import org.example.rc.biz.Demo
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
