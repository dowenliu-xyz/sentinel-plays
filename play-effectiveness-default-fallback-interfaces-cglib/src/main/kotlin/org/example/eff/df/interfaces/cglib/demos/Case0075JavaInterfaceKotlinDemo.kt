// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.EffAnno
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0075, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@Component
class Case0075JavaInterfaceKotlinDemo : Case0075JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

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
