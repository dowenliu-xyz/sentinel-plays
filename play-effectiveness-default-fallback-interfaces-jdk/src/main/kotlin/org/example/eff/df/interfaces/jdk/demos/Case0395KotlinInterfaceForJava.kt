// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0395, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
interface Case0395KotlinInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String

    fun superMethodHandler(e: Throwable?): String

    fun superMethodHandler(): String

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

}
