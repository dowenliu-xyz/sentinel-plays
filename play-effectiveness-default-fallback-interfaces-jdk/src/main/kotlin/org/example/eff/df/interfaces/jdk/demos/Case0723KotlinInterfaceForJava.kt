// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0723, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
interface Case0723KotlinInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String

}
