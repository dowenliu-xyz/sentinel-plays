// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0816, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case0816KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String

}
