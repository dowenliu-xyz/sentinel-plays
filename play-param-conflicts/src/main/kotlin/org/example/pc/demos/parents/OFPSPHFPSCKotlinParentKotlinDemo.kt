package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Demo
import org.springframework.stereotype.Component

@Component
class OFPSPHFPSCKotlinParentKotlinDemo : OFPSPHFPSCKotlinParentForKotlin(), Demo {
    private fun blockHandler(integer: Int?, e: BlockException) {
        Biz.doBlockHandle(integer, e)
    }

    private fun fallback(integer: Int) {
        Biz.doFallback(integer)
    }
}
