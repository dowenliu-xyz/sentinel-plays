// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0567, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@Component
class Case0567JavaInterfaceKotlinDemo : Case0567JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
