// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.EffAnno
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=445, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case445JavaInterfaceKotlinDemo : Case445JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
