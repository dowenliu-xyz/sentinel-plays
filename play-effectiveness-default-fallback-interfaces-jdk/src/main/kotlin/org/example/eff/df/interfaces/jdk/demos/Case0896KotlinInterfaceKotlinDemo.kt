// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0896, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@Component
class Case0896KotlinInterfaceKotlinDemo : Case0896KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
