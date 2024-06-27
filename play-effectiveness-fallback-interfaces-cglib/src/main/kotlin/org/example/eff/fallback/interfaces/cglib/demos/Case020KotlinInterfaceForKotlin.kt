// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=020, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case020KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superClassHandler(name: String?, e: Throwable?): String

    fun superClassHandler(name: String?): String

    fun superMethodHandler(name: String?, e: Throwable?): String

    fun superMethodHandler(name: String?): String

    fun classHandler(name: String?, e: Throwable?): String

    fun classHandler(name: String?): String

}
