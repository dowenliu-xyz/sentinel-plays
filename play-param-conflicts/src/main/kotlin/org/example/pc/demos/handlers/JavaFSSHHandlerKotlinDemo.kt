package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class JavaFSSHHandlerKotlinDemo : Demo {
    @SentinelResource(fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    private fun fallback(str: String?) {
        Biz.doFallback(str)
    }

    @SentinelResource(
        fallback = "fallback",
        fallbackClass = [JavaFSSHHandlerForKotlin::class]
    )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
