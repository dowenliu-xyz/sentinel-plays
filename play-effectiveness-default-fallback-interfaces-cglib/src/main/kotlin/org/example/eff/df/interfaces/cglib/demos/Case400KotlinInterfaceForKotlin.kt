// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=400, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
interface Case400KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun classHandler(e: Throwable?): String

    fun classHandler(): String

}
