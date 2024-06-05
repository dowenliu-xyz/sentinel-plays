package org.example.pc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Biz.doBlockHandle
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: second fallback provided, but first not
 * <br></br>
 * Second fallback hidden. Treat as a conflict
 */
@Component
class SelfSecondFallbackKotlinDemo : Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun blockHandler(integer: Int?, e: BlockException) {
        doBlockHandle(integer, e)
    }

    private fun fallback(integer: Int?) {
        Biz.doFallback(integer)
    }
}
