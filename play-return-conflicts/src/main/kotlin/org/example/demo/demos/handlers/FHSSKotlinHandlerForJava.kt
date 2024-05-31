package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

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
