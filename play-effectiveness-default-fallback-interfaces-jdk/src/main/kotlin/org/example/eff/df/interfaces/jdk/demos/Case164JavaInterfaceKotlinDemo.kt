// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import org.example.eff.df.interfaces.jdk.biz.EffAnno
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=164, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
@Component
class Case164JavaInterfaceKotlinDemo : Case164JavaInterfaceForKotlin {

    override fun superClassHandler(e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superClassHandler(): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
