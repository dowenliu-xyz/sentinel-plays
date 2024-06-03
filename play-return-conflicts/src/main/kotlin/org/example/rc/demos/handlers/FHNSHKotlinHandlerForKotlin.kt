package org.example.rc.demos.handlers

import org.example.rc.biz.Biz

/**
 * case: First fallback should in Handler class but Not provided; Second fallback in Handler class.
 * <br></br>
 * Conflict. Second fallback hidden.
 */
class FHNSHKotlinHandlerForKotlin {
    companion object {
        @JvmStatic
        private fun fallback(): Int {
            return Biz.doSecondFallback()
        }
    }
}
