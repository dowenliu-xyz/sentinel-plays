// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import org.example.eff.df.parents.biz.Greeting

/**
 * Case: Case(sn=0958, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
abstract class Case0958KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun classHandler(e: Throwable?): String

    abstract fun classHandler(): String

}
