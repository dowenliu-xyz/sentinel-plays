// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.EffAnno
import org.example.eff.df.parents.biz.Greeting
import org.example.eff.df.parents.biz.HandlerLocation

/**
 * Case: Case(sn=0438, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
abstract class Case0438KotlinSuperForKotlin {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    abstract fun greeting(name: String?): String

    open fun superMethodHandler(e: Throwable?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback(e)
    }

    open fun superMethodHandler(): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doDefaultFallback()
    }

}
