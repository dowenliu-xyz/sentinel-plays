// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0086, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0086KotlinSuperForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

    abstract fun superMethodHandler(e: Throwable?): String

    abstract fun superMethodHandler(): String

}
