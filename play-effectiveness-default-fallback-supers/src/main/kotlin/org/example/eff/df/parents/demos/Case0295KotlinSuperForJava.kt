// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0295, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0295KotlinSuperForJava {

    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}
