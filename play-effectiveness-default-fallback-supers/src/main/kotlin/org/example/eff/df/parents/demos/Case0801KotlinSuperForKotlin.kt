// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0801, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case0801KotlinSuperForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    abstract fun greeting(name: String?): String

    abstract fun superMethodHandler(e: Throwable?): String

    abstract fun superMethodHandler(): String

    abstract fun classHandler(e: Throwable?): String

    abstract fun classHandler(): String

}