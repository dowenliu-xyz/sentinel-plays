// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.EffAnno
import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.example.eff.fallback.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=235, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case235KotlinInterfaceKotlinDemo : Case235KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "methodHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

    fun methodHandler(name: String?, e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun methodHandler(name: String?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

}
