// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0432, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0432KotlinSuperKotlinDemo : Case0432KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
