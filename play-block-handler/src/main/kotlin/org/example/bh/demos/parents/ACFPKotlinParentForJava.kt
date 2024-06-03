package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting.doBlockHandle

/**
 * case: Annotation in Child and Fallback in Parent
 */
@Suppress("unused")
open class ACFPKotlinParentForJava {
    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
