package org.example.pc.demos.handlers

import org.example.pc.biz.Biz

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br></br>
 * Conflicts.
 */
class KotlinFHSHHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(str: String?) {
            Biz.doFallback(str)
        }

        @JvmStatic
        private fun fallback(integer: Int?) {
            Biz.doFallback(integer)
        }
    }
}
