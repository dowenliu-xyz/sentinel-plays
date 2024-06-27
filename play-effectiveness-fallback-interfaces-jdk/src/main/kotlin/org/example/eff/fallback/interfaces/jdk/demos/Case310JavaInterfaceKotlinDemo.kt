// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=310, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
class Case310JavaInterfaceKotlinDemo : Case310JavaInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}