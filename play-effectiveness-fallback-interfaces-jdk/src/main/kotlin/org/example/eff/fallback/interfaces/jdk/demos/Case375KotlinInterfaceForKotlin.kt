// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import org.example.eff.fallback.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=375, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case375KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
