// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.interfaces.jdk.biz.EffAnno
import org.example.eff.fallback.interfaces.jdk.biz.Greeting
import org.example.eff.fallback.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=153, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case153KotlinInterfaceForKotlin {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

}
