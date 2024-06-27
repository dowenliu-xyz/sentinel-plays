package org.example.eff.block.basic.demos.protectedMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
class ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo {
    private var self: ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: ProtectedMethodWithClassAnnoWithoutMethodAnnoKotlinDemo?) {
        this.self = self
    }

    protected fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun classBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
