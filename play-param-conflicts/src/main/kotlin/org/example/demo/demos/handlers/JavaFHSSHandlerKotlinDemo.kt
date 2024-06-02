package org.example.demo.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Biz
import org.example.demo.biz.Demo
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
