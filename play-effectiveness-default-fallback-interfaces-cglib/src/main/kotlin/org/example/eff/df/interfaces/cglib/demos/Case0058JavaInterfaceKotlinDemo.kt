// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0058, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case0058JavaInterfaceKotlinDemo : Case0058JavaInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
