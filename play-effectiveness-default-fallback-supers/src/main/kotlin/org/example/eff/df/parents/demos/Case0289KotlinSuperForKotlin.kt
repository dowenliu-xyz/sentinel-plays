// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0289, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0289KotlinSuperForKotlin {

    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

    abstract fun classHandler(e: Throwable?): String

    abstract fun classHandler(): String

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}
