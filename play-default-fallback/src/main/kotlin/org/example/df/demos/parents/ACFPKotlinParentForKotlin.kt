package org.example.df.demos.parents

import org.example.df.biz.Greeting.doDefaultFallback

/**
 * case: Annotation in Child and Fallback in Parent
 */
@Suppress("unused")
open class ACFPKotlinParentForKotlin {
    private fun defaultFallback(e: Throwable): String {
        return doDefaultFallback(e)
    }
}
