// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting

/**
 * Case: Case(sn=0858, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case0858KotlinSuperForJava {

    @SentinelResource(value = "demo")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}
