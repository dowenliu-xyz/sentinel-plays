package org.example.rc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.rc.biz.Biz
import org.example.rc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: no fallback in self class
 * <br></br>
 * Not conflict.
 */
@Component
class SelfFallbackNoneKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun first(): String {
        return Biz.doFirst()
    }

    @SentinelResource(fallback = "fallback")
    override fun second(): Int {
        return Biz.doSecond()
    }
}
