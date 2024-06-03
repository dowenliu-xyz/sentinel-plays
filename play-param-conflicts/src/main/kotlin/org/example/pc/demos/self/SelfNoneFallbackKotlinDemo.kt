package org.example.pc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: nether first nor second fallback provided
 * <br></br>
 * Not conflict. The first fallback register a null method, and the second fallback happens to not exist either.
 */
@Component
class SelfNoneFallbackKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
