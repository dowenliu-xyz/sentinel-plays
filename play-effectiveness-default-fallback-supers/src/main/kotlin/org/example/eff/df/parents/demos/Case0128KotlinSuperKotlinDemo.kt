// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import org.example.eff.df.parents.biz.EffAnno
import org.example.eff.df.parents.biz.Greeting
import org.example.eff.df.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0128, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=None, hasHandlerInClass=true)
 */
@Component
class Case0128KotlinSuperKotlinDemo : Case0128KotlinSuperForKotlin() {

    override fun superClassHandler(e: Throwable?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback(e)
    }

    override fun superClassHandler(): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doDefaultFallback()
    }

}
