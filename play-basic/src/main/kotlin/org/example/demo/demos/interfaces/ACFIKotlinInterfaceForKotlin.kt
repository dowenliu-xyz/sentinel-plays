package org.example.demo.demos.interfaces

import org.example.demo.biz.Greeting.doFallback

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForKotlin {
    fun greeting(name: String?): String

    fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }
}
