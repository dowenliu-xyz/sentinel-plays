// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0594, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
interface Case0594KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
