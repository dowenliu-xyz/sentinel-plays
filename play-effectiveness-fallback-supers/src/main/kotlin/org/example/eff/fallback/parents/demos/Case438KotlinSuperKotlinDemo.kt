// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import org.example.eff.fallback.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=438, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case438KotlinSuperKotlinDemo : Case438KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
