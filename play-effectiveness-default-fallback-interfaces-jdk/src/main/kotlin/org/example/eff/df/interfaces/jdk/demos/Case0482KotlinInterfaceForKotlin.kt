// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.EffAnno
import org.example.eff.df.interfaces.jdk.biz.Greeting
import org.example.eff.df.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=0482, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
interface Case0482KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

    fun classHandler(e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun classHandler(): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

    fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

}
