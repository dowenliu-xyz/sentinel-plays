package org.example.pc.demos.handlers

import org.example.pc.biz.Biz

/**
 * case: first fallback from handler class; second fallback not provided
 * <br></br>
 * Not Conflicts.
 */
class KotlinFHSNHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(str: String) {
            Biz.doFallback(str)
        }
    }
}
