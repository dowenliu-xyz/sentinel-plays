// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import org.example.eff.fallback.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=377, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case377KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
