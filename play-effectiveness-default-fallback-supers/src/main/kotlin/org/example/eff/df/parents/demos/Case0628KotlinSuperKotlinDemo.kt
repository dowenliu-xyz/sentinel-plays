// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import org.example.eff.df.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0628, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case0628KotlinSuperKotlinDemo : Case0628KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
