// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.EffAnno
import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.example.eff.fallback.interfaces.cglib.biz.HandlerLocation

/**
 * Case: Case(sn=002, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case002KotlinInterfaceForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

    fun superMethodHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun superMethodHandler(name: String?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

    fun classHandler(name: String?, e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun classHandler(name: String?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

    fun methodHandler(name: String?, e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun methodHandler(name: String?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

}
