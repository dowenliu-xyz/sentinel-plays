// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import org.example.eff.fallback.interfaces.cglib.biz.EffAnno
import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.example.eff.fallback.interfaces.cglib.biz.HandlerLocation

/**
 * Case: Case(sn=455, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
interface Case455KotlinInterfaceForKotlin {

    fun classHandler(name: String?, e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun classHandler(name: String?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

}
