// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0914, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
interface Case0914KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

}
