package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz

open class OFPSCHFPSCKotlinParentForKotlin {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    open fun consumeString(str: String?) {
        Biz.doConsumeString(str)
    }

    private fun blockHandler(str: String?, e: BlockException) {
        Biz.doBlockHandle(str, e)
    }

    private fun fallback(str: String) {
        Biz.doFallback(str)
    }
}
