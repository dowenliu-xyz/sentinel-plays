package org.example.demo.demos.interfaces

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.demo.biz.Greeting.doBlockHandle

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForJava {
    fun greeting(name: String?): String

    fun blockHandler(name: String?, e: BlockException?): String {
        return doBlockHandle(name, e)
    }
}
