// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=479, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case479JavaInterfaceKotlinDemo : Case479JavaInterfaceForKotlin {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
