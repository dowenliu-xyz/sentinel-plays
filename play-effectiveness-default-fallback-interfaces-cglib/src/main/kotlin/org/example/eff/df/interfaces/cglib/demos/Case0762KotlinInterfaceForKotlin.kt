// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0762, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
interface Case0762KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
