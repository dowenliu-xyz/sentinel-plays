package org.example.pc.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz

open class OFCSCHFPSPKotlinParentForKotlin {
    private fun blockHandler(str: String?, e: BlockException) {
        Biz.doBlockHandle(str, e)
    }

    private fun blockHandler(integer: Int?, e: BlockException) {
        Biz.doBlockHandle(integer, e)
    }

    private fun fallback(str: String) {
        Biz.doFallback(str)
    }

    private fun fallback(integer: Int) {
        Biz.doFallback(integer)
    }
}
