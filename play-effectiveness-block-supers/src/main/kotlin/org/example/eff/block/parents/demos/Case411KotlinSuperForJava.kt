// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import org.example.eff.block.parents.biz.Greeting

/**
 * Case: Case(sn=411, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
abstract class Case411KotlinSuperForJava {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
