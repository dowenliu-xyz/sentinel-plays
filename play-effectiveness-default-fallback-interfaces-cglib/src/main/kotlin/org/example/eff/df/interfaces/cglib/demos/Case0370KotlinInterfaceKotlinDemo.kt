// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0370, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0370KotlinInterfaceKotlinDemo : Case0370KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
