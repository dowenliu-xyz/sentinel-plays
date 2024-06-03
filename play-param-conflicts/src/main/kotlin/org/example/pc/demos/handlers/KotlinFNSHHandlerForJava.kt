package org.example.pc.demos.handlers

import org.example.pc.biz.Biz

/**
 * case: first fallback not provided; second fallback from handler class
 * <br></br>
 * Not conflicts.
 */
class KotlinFNSHHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(integer: Int?) {
            Biz.doFallback(integer)
        }
    }
}
