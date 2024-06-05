package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class KotlinFNSHHandlerKotlinDemo : Demo {
    @SentinelResource
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFNSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFNSHHandlerForKotlin::class],
    )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
