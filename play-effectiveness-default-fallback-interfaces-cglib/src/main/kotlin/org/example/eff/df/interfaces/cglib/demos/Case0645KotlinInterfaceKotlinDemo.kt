// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0645, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@Component
class Case0645KotlinInterfaceKotlinDemo : Case0645KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}