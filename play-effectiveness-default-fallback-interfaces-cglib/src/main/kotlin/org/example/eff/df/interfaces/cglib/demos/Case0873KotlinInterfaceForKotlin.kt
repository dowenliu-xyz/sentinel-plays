// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0873, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
interface Case0873KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
