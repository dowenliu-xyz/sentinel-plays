package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting.doBlockHandle
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@Primary
class AUPJavaParentKotlinDemo : AUPJavaParentForKotlin() {
    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
