// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0904, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case0904KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

    fun methodHandler(e: Throwable?): String

    fun methodHandler(): String

}
