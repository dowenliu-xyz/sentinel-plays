// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.EffAnno
import org.example.eff.df.parents.biz.Greeting
import org.example.eff.df.parents.biz.HandlerLocation

/**
 * Case: Case(sn=0633, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
abstract class Case0633KotlinSuperForKotlin {

    abstract fun greeting(name: String?): String

    open fun classHandler(e: Throwable?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    open fun classHandler(): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

}
