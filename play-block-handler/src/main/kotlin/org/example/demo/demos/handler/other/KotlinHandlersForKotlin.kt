package org.example.demo.demos.handler.other

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.demo.biz.Greeting.doBlockHandle

@Suppress("unused")
class KotlinHandlersForKotlin {
    companion object {
        @JvmStatic
        private fun blockHandler(name: String?, e: BlockException?): String {
            return doBlockHandle(name, e)
        }
    }
}