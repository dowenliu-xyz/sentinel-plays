// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.cglib.biz.EffAnno
import org.example.eff.fallback.interfaces.cglib.biz.Greeting
import org.example.eff.fallback.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=427, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case427KotlinInterfaceKotlinDemo : Case427KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", fallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun methodHandler(name: String?, e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    override fun methodHandler(name: String?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

}
