// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0700, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
interface Case0700KotlinInterfaceForKotlin {

    fun methodHandler(e: Throwable?): String

    fun methodHandler(): String

}
