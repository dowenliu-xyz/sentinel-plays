// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=480, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case480JavaSuperKotlinDemo : Case480JavaSuperForKotlin() {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
