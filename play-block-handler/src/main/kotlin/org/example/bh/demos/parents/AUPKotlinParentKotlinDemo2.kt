package org.example.bh.demos.parents

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.bh.biz.Greeting.doBlockHandle
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
class AUPKotlinParentKotlinDemo2 : AUPKotlinParentForKotlin() {
    private fun blockHandler(name: String, e: BlockException): String {
        return doBlockHandle(name, e)
    }
}
