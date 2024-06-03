package org.example.rc.demos.handlers

import org.example.rc.biz.Biz

/**
 * case: First fallback in Handler class; Second fallback Not set.
 * <br></br>
 * Not conflict.
 */
class FHSNKotlinHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(): String {
            return Biz.doFirstFallback()
        }
    }
}
