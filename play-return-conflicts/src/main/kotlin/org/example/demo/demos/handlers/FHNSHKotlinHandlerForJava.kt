package org.example.demo.demos.handlers

import org.example.demo.biz.Biz

/**
 * case: First fallback should in Handler class but Not provided; Second fallback in Handler class.
 * <br></br>
 * Conflict. Second fallback hidden.
 */
class FHNSHKotlinHandlerForJava {
    companion object {
        @JvmStatic
        private fun fallback(): Int {
            return Biz.doSecondFallback()
        }
    }
}
