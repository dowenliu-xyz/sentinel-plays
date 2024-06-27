package org.example.eff.block.basic.demos.privateMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
class PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo {
    private var self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo? = null

    @Autowired
    fun setSelf(self: PrivateMethodWithClassAnnoWithMethodAnnoKotlinDemo?) {
        this.self = self
    }

    @SentinelResource(value = "demo", blockHandler = "methodBlockHandler") // TODO private 方法的注解应该提示无效
    private fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun exportGreeting(name: String?): String {
        return self!!.greeting(name)
    }

    fun classBlockHandler(name: String?, e: BlockException?): String {
        return ""
    }

    fun methodBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
