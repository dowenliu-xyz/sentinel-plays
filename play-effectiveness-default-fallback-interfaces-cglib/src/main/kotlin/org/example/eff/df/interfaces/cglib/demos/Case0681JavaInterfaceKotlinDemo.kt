// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0681, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
class Case0681JavaInterfaceKotlinDemo : Case0681JavaInterfaceForKotlin {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
