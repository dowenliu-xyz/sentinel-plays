// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=462, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case462KotlinInterfaceKotlinDemo : Case462KotlinInterfaceForKotlin {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
