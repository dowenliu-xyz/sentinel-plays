// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=1078, classAnnoOnSuper=None, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@Component
class Case1078KotlinSuperKotlinDemo : Case1078KotlinSuperForKotlin() {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
