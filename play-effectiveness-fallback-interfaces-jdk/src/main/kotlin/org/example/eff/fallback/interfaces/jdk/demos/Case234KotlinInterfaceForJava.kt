// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=234, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
interface Case234KotlinInterfaceForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superMethodHandler(name: String?, e: Throwable?): String

    fun superMethodHandler(name: String?): String

}
