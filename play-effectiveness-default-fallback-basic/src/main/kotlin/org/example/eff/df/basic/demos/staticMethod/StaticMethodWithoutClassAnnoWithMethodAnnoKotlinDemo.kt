package org.example.eff.df.basic.demos.staticMethod

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.basic.biz.AnnoType
import org.example.eff.df.basic.biz.Greeting
import org.springframework.stereotype.Component

@Component
class StaticMethodWithoutClassAnnoWithMethodAnnoKotlinDemo {
    companion object {
        @SentinelResource(value = "demo", defaultFallback = "methodDefaultFallback") // TODO static 方法上注解应该提示不生效 （现在提示的是 not bean ， 应该也是 OK 的）
        @JvmStatic
        fun greeting(name: String?): String {
            return Greeting.doGreeting(name)
        }
    }

    fun methodDefaultFallback(e: Throwable?): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodDefaultFallback(): String {
        return AnnoType.MethodAnno.name + ":" + Greeting.doDefaultFallback()
    }
}
