// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0497, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
interface Case0497KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

}