// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0160, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
interface Case0160KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
