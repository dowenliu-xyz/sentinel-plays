// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=265, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
interface Case265KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String

    fun superMethodHandler(name: String?, e: Throwable?): String

    fun superMethodHandler(name: String?): String

    fun classHandler(name: String?, e: Throwable?): String

    fun classHandler(name: String?): String

}
