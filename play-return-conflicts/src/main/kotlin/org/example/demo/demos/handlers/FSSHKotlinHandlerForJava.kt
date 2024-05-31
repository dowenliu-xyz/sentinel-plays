package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: First fallback in Self class; Second fallback in Handler class.
 * <br></br>
 * Not conflict.
 */
class FSSHKotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(): Int? {
            return Biz.doSecondFallback()
        }
    }
}
