// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0699, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
@Component
class Case0699JavaSuperKotlinDemo : Case0699JavaSuperForKotlin() {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
