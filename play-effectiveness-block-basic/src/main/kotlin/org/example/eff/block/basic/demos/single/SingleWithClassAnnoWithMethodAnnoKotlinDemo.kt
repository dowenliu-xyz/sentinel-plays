package org.example.eff.block.basic.demos.single

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
class SingleWithClassAnnoWithMethodAnnoKotlinDemo {
    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    @Suppress("unused")
    fun classBlockHandler(name: String?, e: BlockException?): String {
        return ""
    }

    fun methodBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
