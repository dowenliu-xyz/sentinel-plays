package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz
import org.example.pc.biz.Biz.doBlockHandle

/**
 * case: first fallback from handler class; second fallback not provided
 * <br></br>
 * Not Conflicts.
 */
class KotlinFHSNHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun blockHandler(str: String?, e: BlockException) {
            doBlockHandle(str, e)
        }

        @JvmStatic
        private fun fallback(str: String) {
            Biz.doFallback(str)
        }
    }
}
