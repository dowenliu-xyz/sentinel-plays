// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.EffAnno
import org.example.eff.df.parents.biz.Greeting
import org.example.eff.df.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0753, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case0753JavaSuperKotlinDemo : Case0753JavaSuperForKotlin() {

    @SentinelResource(value = "demo", defaultFallback = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun superMethodHandler(e: Throwable?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superMethodHandler(): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

    override fun methodHandler(e: Throwable?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun methodHandler(): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
