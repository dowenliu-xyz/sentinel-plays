// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=197, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case197KotlinInterfaceForJava {

    fun greeting(name: String?): String

    fun superClassHandler(name: String?, e: Throwable?): String

    fun superClassHandler(name: String?): String

}
