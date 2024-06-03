package org.example.rc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.rc.biz.Biz
import org.example.rc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: first fallback in self class
 * <br></br>
 * Conflict.
 */
@Component
class SelfFallbackFirstKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun first(): String {
        return Biz.doFirst()
    }

    private fun fallback(): String {
        return Biz.doFirstFallback()
    }

    @SentinelResource(fallback = "fallback")
    override fun second(): Int {
        return Biz.doSecond()
    }
}
