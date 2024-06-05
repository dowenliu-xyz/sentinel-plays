package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class KotlinFHSNHandlerKotlinDemo : Demo {
    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFHSNHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFHSNHandlerForKotlin::class],
        )
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
