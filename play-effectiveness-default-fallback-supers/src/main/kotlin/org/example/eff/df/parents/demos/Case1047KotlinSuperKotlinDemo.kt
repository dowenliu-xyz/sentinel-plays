// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=1047, classAnnoOnSuper=None, originMethodInSuper=None, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case1047KotlinSuperKotlinDemo : Case1047KotlinSuperForKotlin() {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}