package org.example.basic.demos.parents

import org.example.basic.biz.Greeting.doFallback

/**
 * case: Annotation in Child and Fallback in Parent
 */
@Suppress("unused")
open class ACFPKotlinParentForKotlin {
    private fun fallback(name: String, e: Throwable): String {
        return doFallback(name, e)
    }
}
