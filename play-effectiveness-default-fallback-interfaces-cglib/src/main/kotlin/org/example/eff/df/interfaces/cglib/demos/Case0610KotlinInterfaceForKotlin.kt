// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0610, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
interface Case0610KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
