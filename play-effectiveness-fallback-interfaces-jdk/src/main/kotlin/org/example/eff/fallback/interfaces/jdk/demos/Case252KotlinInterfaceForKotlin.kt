// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.EffAnno
import org.example.eff.fallback.interfaces.jdk.biz.Greeting
import org.example.eff.fallback.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=252, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
interface Case252KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    fun greeting(name: String?): String

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