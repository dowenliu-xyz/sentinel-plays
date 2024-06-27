// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.parents.biz.EffAnno
import org.example.eff.fallback.parents.biz.Greeting
import org.example.eff.fallback.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=339, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
class Case339KotlinSuperKotlinDemo : Case339KotlinSuperForKotlin() {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun classHandler(name: String?, e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name, e)
    }

    fun classHandler(name: String?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doFallback(name)
    }

}
