// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0924, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0924KotlinSuperKotlinDemo : Case0924KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
