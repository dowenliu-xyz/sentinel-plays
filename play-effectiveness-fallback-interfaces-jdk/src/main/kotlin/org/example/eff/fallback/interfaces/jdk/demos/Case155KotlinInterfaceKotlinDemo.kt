// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import org.example.eff.fallback.interfaces.jdk.biz.EffAnno
import org.example.eff.fallback.interfaces.jdk.biz.Greeting
import org.example.eff.fallback.interfaces.jdk.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=155, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@Component
class Case155KotlinInterfaceKotlinDemo : Case155KotlinInterfaceForKotlin {

    override fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    override fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

}
