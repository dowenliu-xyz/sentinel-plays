package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: first fallback from handler class; second fallback from self class
 * <br></br>
 * Not Conflicts.
 */
class KotlinFHSSHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(str: String) {
            Biz.doFallback(str)
        }
    }
}
