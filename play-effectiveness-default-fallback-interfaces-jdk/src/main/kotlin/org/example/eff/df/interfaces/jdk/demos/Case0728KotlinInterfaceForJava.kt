// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0728, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
interface Case0728KotlinInterfaceForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    fun greeting(name: String?): String

}
