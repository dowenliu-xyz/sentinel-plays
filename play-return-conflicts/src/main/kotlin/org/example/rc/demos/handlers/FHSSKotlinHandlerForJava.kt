package org.example.rc.demos.handlers

import org.example.rc.biz.Biz

/**
 * case: First fallback in Handler class; Second fallback in Self class.
 * <br></br>
 * Not conflict.
 */
class FHSSKotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(): String {
            return Biz.doFirstFallback()
        }
    }
}
