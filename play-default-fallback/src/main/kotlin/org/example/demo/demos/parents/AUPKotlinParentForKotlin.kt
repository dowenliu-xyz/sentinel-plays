package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.example.demo.biz.Greeting.doGreeting

/**
 * case: Annotated Un-overridden Parent
 * <br/>
 * Aspect takes effect, fallback takes effect.
 */
open class AUPKotlinParentForKotlin {
    @SentinelResource(value = "demo", defaultFallback = "defaultFallback") // TODO 成功解析到子类方法，但检查有问题：未找到方法
    open fun greeting(name: String?): String {
        return doGreeting(name)
    }
}
