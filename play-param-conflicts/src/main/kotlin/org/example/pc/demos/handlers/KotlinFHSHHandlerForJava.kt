package org.example.pc.demos.handlers

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.pc.biz.Biz.doBlockHandle
import org.example.pc.biz.Biz.doFallback

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br></br>
 * Conflicts.
 */
class KotlinFHSHHandlerForJava {
    companion object {
        @JvmStatic
        private fun blockHandler(str: String?, e: BlockException) {
            doBlockHandle(str, e)
        }

        @JvmStatic
        private fun blockHandler(integer: Int?, e: BlockException) {
            doBlockHandle(integer, e)
        }

        @JvmStatic
        private fun fallback(str: String?) {
            doFallback(str)
        }

        @JvmStatic
        private fun fallback(integer: Int?) {
            doFallback(integer)
        }
    }
}
