package org.example.pc.demos.handlers

import org.example.pc.biz.Biz

/**
 * case: first fallback from handler class; second fallback from self class
 * <br></br>
 * Not Conflicts.
 */
class KotlinFHSSHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(str: String) {
            Biz.doFallback(str)
        }
    }
}