// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=004, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
class Case004KotlinInterfaceKotlinDemo : Case004KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
