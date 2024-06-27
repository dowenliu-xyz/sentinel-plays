// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=157, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case157KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superClassHandler(name: String?, e: Throwable?): String

    fun superClassHandler(name: String?): String

    fun classHandler(name: String?, e: Throwable?): String

    fun classHandler(name: String?): String

    fun methodHandler(name: String?, e: Throwable?): String

    fun methodHandler(name: String?): String

}
