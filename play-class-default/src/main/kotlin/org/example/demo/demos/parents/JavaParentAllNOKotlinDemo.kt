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
class JavaParentAllNOKotlinDemo : JavaParentAllNOForKotlin() {
    @SentinelResource(value = "demo") // TODO 设置到方法上，修改一个方法的 visibility 后，另一个方法不提示修改 visibility 了
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }
}
