// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=417, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
interface Case417KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
