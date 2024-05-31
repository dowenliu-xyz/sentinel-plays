package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: first fallback from handler class; second fallback from handler class
 * <br></br>
 * Conflicts.
 */
class KotlinFHSHHandlerForKotlin {
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
