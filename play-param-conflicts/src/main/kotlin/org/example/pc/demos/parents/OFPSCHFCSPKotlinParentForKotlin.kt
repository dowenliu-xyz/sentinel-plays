package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz

open class OFPSCHFCSPKotlinParentForKotlin {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    open fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    private fun blockHandler(integer: Int?, e: BlockException) {
        Biz.doBlockHandle(integer, e)
    }

    private fun fallback(integer: Int) {
        Biz.doFallback(integer)
    }
}
