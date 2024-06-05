package org.example.pc.demos.self

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Biz.doBlockHandle
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

/**
 * case: first fallback provided, but second not
 * <br></br>
 * Conflict.
 */
@Component
class SelfFirstFallbackKotlinDemo : Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    override fun consumeInteger(integer: Int?) {
        Biz.doConsumeInteger(integer)
    }

    private fun blockHandler(str: String?, e: BlockException) {
        doBlockHandle(str, e)
    }

    private fun fallback(str: String?) {
        Biz.doFallback(str)
    }
}
