// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=0544, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
interface Case0544KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
