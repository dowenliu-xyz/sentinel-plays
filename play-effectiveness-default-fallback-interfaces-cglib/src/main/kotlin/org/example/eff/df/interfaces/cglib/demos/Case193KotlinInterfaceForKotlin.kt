// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=193, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
interface Case193KotlinInterfaceForKotlin {

    fun greeting(name: String?): String

    fun superClassHandler(e: Throwable?): String

    fun superClassHandler(): String

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

    fun methodHandler(e: Throwable?): String

    fun methodHandler(): String

}