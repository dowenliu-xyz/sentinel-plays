package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: first fallback from self class; second fallback from handler class
 * <br></br>
 * Not conflicts.
 */
class KotlinFSSHHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(integer: Int?) {
            Biz.doFallback(integer)
        }
    }
}
