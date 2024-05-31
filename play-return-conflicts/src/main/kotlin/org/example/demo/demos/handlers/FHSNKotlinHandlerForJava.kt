package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: First fallback in Handler class; Second fallback Not set.
 * <br></br>
 * Not conflict.
 */
class FHSNKotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(): String {
            return Biz.doFirstFallback()
        }
    }
}
