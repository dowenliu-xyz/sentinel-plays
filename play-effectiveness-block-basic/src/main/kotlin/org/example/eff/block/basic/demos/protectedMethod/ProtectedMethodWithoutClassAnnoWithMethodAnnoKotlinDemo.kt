package org.example.eff.block.basic.demos.protectedMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProtectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo {
    private var self: ProtectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: ProtectedMethodWithoutClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler")
    protected fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun methodBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
