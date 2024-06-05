package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class KotlinFHSHHandlerKotlinDemo : Demo {
    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFHSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFHSHHandlerForKotlin::class],
    )
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFHSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFHSHHandlerForKotlin::class],
    )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
