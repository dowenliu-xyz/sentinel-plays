// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0988, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@Component
class Case0988JavaInterfaceKotlinDemo : Case0988JavaInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}