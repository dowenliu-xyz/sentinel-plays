// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.parents.biz.EffAnno
import org.example.eff.fallback.parents.biz.Greeting
import org.example.eff.fallback.parents.biz.HandlerLocation

/**
 * Case: Case(sn=122, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case122KotlinSuperForKotlin {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    open fun superClassHandler(name: String?, e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name, e)
    }

    open fun superClassHandler(name: String?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doFallback(name)
    }

}
