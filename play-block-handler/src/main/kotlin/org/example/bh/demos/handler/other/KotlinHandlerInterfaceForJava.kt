package org.example.bh.demos.handler.other

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting

interface KotlinHandlerInterfaceForJava {
    companion object {
        @JvmStatic
        fun blockHandle(name: String, e: BlockException): String {
            return Greeting.doBlockHandle(name, e)
        }
    }
}
