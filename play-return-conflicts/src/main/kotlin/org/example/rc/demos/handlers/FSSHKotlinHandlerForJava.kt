package org.example.rc.demos.handlers

import org.example.rc.biz.Biz

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
