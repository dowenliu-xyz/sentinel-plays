// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0689, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@Component
class Case0689JavaInterfaceKotlinDemo : Case0689JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
