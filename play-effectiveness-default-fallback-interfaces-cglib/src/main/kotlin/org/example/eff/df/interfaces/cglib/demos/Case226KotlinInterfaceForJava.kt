// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=226, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
interface Case226KotlinInterfaceForJava {

    fun superClassHandler(e: Throwable?): String

    fun superClassHandler(): String

    fun methodHandler(e: Throwable?): String

    fun methodHandler(): String

}