package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class KotlinFHSSHandlerKotlinDemo : Demo {
    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFHSSHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFHSSHandlerForKotlin::class],
        )
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun blockHandler(integer: Int?, e: BlockException) {
        Biz.doBlockHandle(integer, e)
    }

    private fun fallback(integer: Int?) {
        Biz.doFallback(integer)
    }
}
