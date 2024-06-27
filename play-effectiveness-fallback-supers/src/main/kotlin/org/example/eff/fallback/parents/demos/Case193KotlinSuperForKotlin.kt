// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=193, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case193KotlinSuperForKotlin {

    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(name: String?, e: Throwable?): String

    abstract fun superClassHandler(name: String?): String

    abstract fun classHandler(name: String?, e: Throwable?): String

    abstract fun classHandler(name: String?): String

    abstract fun methodHandler(name: String?, e: Throwable?): String

    abstract fun methodHandler(name: String?): String

}
