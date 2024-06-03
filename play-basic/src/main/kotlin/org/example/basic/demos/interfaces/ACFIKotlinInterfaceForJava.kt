package org.example.basic.demos.interfaces

import org.example.basic.biz.Greeting.doFallback

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForJava {
    fun greeting(name: String?): String

    fun fallback(name: String?, e: Throwable?): String {
        return doFallback(name, e)
    }
}
