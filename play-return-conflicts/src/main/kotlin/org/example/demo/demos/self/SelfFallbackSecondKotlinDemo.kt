package org.example.demo.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: second fallback in self class
 * <br></br>
 * Conflict. Second fallback hidden
 */
@Component
class SelfFallbackSecondKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback")
    override fun second(): Int {
        return Biz.doSecond()
    }

    private fun fallback(): Int {
        return Biz.doSecondFallback()
    }
}
