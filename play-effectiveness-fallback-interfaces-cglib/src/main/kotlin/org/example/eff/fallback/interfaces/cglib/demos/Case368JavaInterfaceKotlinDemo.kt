// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=368, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@Component
class Case368JavaInterfaceKotlinDemo : Case368JavaInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}