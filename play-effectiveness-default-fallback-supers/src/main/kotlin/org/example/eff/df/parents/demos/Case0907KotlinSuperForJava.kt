// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0907, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case0907KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}
