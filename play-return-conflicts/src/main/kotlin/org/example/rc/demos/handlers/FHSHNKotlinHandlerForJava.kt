package org.example.rc.demos.handlers

import org.example.rc.biz.Biz

/**
 * case: First fallback in Handler class; Second fallback should in Handler class, but Not provided.
 * <br></br>
 * Conflict.
 */
class FHSHNKotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(): String {
            return Biz.doFirstFallback()
        }
    }
}
