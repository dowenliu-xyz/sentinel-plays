// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0340, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0340KotlinSuperForJava {

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}
