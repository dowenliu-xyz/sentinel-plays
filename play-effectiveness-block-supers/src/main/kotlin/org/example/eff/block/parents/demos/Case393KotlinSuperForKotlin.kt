// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import org.example.eff.block.parents.biz.Greeting

/**
 * Case: Case(sn=393, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case393KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
