// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import org.example.eff.fallback.parents.biz.Greeting

/**
 * Case: Case(sn=397, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case397KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun classHandler(name: String?, e: Throwable?): String

    abstract fun classHandler(name: String?): String

    abstract fun methodHandler(name: String?, e: Throwable?): String

    abstract fun methodHandler(name: String?): String

}
