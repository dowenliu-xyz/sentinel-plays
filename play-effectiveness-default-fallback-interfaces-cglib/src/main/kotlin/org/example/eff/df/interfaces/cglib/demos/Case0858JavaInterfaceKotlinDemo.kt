// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.EffAnno
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0858, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case0858JavaInterfaceKotlinDemo : Case0858JavaInterfaceForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
