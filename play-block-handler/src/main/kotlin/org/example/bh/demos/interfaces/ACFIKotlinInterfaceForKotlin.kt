package org.example.bh.demos.interfaces

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting.doBlockHandle

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
// with compiler option: -Xjvm-default=all
interface ACFIKotlinInterfaceForKotlin {
    fun greeting(name: String?): String

    fun blockHandler(name: String?, e: BlockException?): String {
        return doBlockHandle(name, e)
    }
}
