package org.example.bh.demos.handler.other

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting.doBlockHandle

@Suppress("unused")
class KotlinHandlersForJava {
    companion object {
        @JvmStatic
        private fun blockHandler(name: String?, e: BlockException?): String {
            return doBlockHandle(name, e)
        }
    }
}