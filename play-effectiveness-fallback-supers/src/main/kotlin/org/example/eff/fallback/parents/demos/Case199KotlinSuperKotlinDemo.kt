// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.parents.biz.EffAnno
import org.example.eff.fallback.parents.biz.Greeting
import org.example.eff.fallback.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=199, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
class Case199KotlinSuperKotlinDemo : Case199KotlinSuperForKotlin() {

    @SentinelResource(value = "demo", fallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

    fun classHandler(name: String?, e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun classHandler(name: String?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

    fun methodHandler(name: String?, e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun methodHandler(name: String?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

}
