// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=1076, classAnnoOnSuper=None, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@Component
class Case1076KotlinSuperKotlinDemo : Case1076KotlinSuperForKotlin() {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}