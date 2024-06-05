package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Biz.doBlockHandle

/**
 * case: first fallback not provided; second fallback from handler class
 * <br></br>
 * Not conflicts.
 */
class KotlinFNSHHandlerForJava {
    companion object {
        @JvmStatic
        private fun blockHandler(integer: Int?, e: BlockException) {
            doBlockHandle(integer, e)
        }

        @JvmStatic
        private fun fallback(integer: Int?) {
            Biz.doFallback(integer)
        }
    }
}
