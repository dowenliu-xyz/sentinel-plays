package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: First fallback Not set; Second fallback in Handler class.
 * <br></br>
 * Not conflict.
 */
class FNSHKotlinHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(): Int? {
            return Biz.doSecondFallback()
        }
    }
}
