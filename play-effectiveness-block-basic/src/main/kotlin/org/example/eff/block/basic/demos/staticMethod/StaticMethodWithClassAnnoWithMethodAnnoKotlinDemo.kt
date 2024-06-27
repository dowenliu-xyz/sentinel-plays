package org.example.eff.block.basic.demos.staticMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler")
class StaticMethodWithClassAnnoWithMethodAnnoKotlinDemo {
    companion object {
        @SentinelResource(value = "demo", blockHandler = "methodBlockHandler") // TODO static 方法上注解应该提示不生效 （现在提示的是 not bean ， 应该也是 OK 的）
        @JvmStatic
        fun greeting(name: String?): String {
            return Greeting.doGreeting(name)
        }
    }

    @Suppress("unused")
    fun classBlockHandler(name: String?, e: BlockException?): String {
        return ""
    }

    fun methodBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
