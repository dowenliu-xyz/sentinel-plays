// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.EffAnno
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0225, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=None, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
@Component
class Case0225KotlinInterfaceKotlinDemo : Case0225KotlinInterfaceForKotlin {

    override fun superClassHandler(e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superClassHandler(): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}