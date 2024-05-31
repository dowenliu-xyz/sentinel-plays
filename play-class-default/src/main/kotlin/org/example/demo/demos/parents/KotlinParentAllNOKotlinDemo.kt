package org.example.demo.demos.parents

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.demo.biz.Greeting
import org.springframework.stereotype.Component

/**
 * case: annotation on parent class, no defaultFallback method overridden
 * <br></br>
 * Aspect takes effect, defaultFallback takes effect.
 */
@Component
class KotlinParentAllNOKotlinDemo : KotlinParentAllNOForKotlin() {
    @SentinelResource(value = "demo") // TODO 设置 defaultFallback 后提示修改 visibility 只要修改一个之后，另一个就不提示了
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
