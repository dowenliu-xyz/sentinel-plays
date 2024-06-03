package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFHSSHandlerKotlinDemo : Demo {
    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFHSSHandlerForKotlin::class]
    )
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
