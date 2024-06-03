package org.example.pc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: first fallback provided, but second not
 * <br></br>
 * Conflict.
 * TODO 没有提示出来冲突
 */
@Component
class SelfFirstFallbackKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun fallback(str: String?) {
        Biz.doFallback(str)
    }
}
