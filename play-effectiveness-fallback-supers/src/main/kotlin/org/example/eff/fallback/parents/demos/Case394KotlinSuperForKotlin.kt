// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import org.example.eff.fallback.parents.biz.Greeting

/**
 * Case: Case(sn=394, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
abstract class Case394KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}