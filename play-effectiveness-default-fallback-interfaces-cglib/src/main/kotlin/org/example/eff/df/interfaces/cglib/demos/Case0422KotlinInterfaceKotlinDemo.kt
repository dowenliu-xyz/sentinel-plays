// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0422, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
class Case0422KotlinInterfaceKotlinDemo : Case0422KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
