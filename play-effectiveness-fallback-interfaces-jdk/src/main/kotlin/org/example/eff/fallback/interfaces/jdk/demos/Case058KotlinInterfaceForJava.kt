// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=058, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case058KotlinInterfaceForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String

    fun superClassHandler(name: String?, e: Throwable?): String

    fun superClassHandler(name: String?): String

    fun superMethodHandler(name: String?, e: Throwable?): String

    fun superMethodHandler(name: String?): String

}
