// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import org.example.eff.fallback.parents.biz.Greeting

/**
 * Case: Case(sn=405, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case405KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
