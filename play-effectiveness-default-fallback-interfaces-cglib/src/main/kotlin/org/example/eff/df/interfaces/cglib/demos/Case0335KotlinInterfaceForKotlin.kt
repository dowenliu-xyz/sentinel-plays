// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0335, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
interface Case0335KotlinInterfaceForKotlin {

    fun superClassHandler(e: Throwable?): String

    fun superClassHandler(): String

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

}
