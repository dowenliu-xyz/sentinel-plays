package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting
import org.example.bh.biz.Greeting.doBlockHandle
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AAPJavaParentKotlinDemo : AAPJavaParentForKotlin() {
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
