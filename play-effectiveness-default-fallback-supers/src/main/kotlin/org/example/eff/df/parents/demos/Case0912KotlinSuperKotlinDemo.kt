// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0912, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case0912KotlinSuperKotlinDemo : Case0912KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
