// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0338, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0338KotlinSuperForJava {

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

}