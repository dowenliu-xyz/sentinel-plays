// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import org.example.eff.df.interfaces.cglib.biz.EffAnno
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0036, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=true)
 */
@Component
class Case0036JavaInterfaceKotlinDemo : Case0036JavaInterfaceForKotlin {

    override fun superClassHandler(e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superClassHandler(): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

    override fun superMethodHandler(e: Throwable?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superMethodHandler(): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
