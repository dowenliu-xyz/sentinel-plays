// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=477, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@Component
class Case477JavaSuperKotlinDemo : Case477JavaSuperForKotlin() {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
