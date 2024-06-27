package org.example.eff.block.basic.demos.finalClass

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.basic.biz.Greeting
import org.springframework.stereotype.Component

@Suppress("unused")
@Component
@SentinelResource(value = "demo", blockHandler = "classBlockHandler") // TODO 仅类注解，AOP 不生效，不应该报错
final class FinalClassWithClassAnnoWithoutMethodAnnoKotlinDemo {
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classBlockHandler(name: String?, e: BlockException?): String {
        return Greeting.doBlockHandler(name, e)
    }
}
