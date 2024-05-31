package org.example.demo.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: second fallback provided, but first not
 * <br></br>
 * Second fallback hidden. Treat as a conflict
 * TODO 没有提示冲突
 */
@Component
class SelfSecondFallbackKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun fallback(integer: Int?) {
        Biz.doFallback(integer)
    }
}
