package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: first fallback from handler class; second fallback not provided
 * <br></br>
 * Not Conflicts.
 */
class KotlinFHSNHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(str: String) {
            Biz.doFallback(str)
        }
    }
}
