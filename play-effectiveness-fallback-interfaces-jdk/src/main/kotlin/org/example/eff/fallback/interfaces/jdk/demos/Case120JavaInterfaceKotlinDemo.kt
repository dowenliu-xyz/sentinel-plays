// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=120, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@Component
class Case120JavaInterfaceKotlinDemo : Case120JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}