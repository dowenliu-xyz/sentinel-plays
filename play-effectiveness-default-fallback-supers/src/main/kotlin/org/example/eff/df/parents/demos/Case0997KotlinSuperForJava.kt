// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import org.example.eff.df.parents.biz.EffAnno
import org.example.eff.df.parents.biz.Greeting
import org.example.eff.df.parents.biz.HandlerLocation

/**
 * Case: Case(sn=0997, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case0997KotlinSuperForJava {

    abstract fun greeting(name: String?): String

    open fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    open fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

}
