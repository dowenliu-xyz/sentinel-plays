package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class KotlinFSSHHandlerKotlinDemo : Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    private fun blockHandler(str: String?, e: BlockException) {
        Biz.doBlockHandle(str, e)
    }

    private fun fallback(str: String?) {
        Biz.doFallback(str)
    }

    @SentinelResource(
        blockHandler = "blockHandler", blockHandlerClass = [KotlinFSSHHandlerForKotlin::class],
        fallback = "fallback", fallbackClass = [KotlinFSSHHandlerForKotlin::class],
        )
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }
}
