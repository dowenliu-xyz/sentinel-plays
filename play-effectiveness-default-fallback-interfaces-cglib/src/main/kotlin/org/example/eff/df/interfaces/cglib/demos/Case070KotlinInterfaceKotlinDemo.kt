// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=070, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case070KotlinInterfaceKotlinDemo : Case070KotlinInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
