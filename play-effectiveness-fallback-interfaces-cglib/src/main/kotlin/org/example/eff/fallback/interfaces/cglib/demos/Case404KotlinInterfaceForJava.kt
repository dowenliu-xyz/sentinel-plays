// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import org.example.eff.fallback.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=404, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
interface Case404KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
