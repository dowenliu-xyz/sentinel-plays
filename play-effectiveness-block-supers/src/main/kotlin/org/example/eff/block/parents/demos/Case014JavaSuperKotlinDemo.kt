// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=014, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case014JavaSuperKotlinDemo : Case014JavaSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
