// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=449, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case449JavaSuperKotlinDemo : Case449JavaSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
