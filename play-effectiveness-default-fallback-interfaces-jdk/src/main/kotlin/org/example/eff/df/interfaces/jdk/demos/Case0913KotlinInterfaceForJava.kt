// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import org.example.eff.df.interfaces.jdk.biz.EffAnno
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=0913, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case0913KotlinInterfaceForJava {

    fun greeting(name: String?): String

    fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

}