// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=266, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case266KotlinInterfaceForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String

    fun superMethodHandler(name: String?, e: Throwable?): String

    fun superMethodHandler(name: String?): String

    fun methodHandler(name: String?, e: Throwable?): String

    fun methodHandler(name: String?): String

}
