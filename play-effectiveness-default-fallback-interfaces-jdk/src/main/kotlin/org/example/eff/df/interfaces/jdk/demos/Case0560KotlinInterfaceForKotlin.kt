// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=0560, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
interface Case0560KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
