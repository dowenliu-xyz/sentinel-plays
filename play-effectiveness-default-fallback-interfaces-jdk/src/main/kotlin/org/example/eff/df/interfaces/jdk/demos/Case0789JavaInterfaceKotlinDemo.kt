// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0789, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@Component
class Case0789JavaInterfaceKotlinDemo : Case0789JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
