package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class OFPSCHFPSCJavaParentKotlinDemo : OFPSCHFPSCJavaParentForKotlin(), Demo {
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
