// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.EffAnno
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.example.eff.df.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0375, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
@Component
class Case0375KotlinInterfaceKotlinDemo : Case0375KotlinInterfaceForKotlin {

    override fun superMethodHandler(e: Throwable?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superMethodHandler(): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
