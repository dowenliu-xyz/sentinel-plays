// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=227, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case227KotlinSuperForKotlin {

    abstract fun superClassHandler(name: String?, e: Throwable?): String

    abstract fun superClassHandler(name: String?): String

}
