// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0327, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0327JavaSuperKotlinDemo : Case0327JavaSuperForKotlin() {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}