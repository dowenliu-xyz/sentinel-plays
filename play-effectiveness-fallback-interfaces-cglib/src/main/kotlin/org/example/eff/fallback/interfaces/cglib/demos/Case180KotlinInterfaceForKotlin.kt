// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=180, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case180KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
