// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=341, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
interface Case341KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
