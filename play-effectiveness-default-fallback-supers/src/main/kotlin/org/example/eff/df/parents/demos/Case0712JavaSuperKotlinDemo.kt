// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0712, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0712JavaSuperKotlinDemo : Case0712JavaSuperForKotlin() {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
