// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import org.example.eff.fallback.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=449, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case449KotlinSuperKotlinDemo : Case449KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}