// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0710, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case0710KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String

    fun superMethodHandler(e: Throwable?): String

    fun superMethodHandler(): String

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

}
