// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.parents.biz.Greeting

/**
 * Case: Case(sn=328, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
abstract class Case328KotlinSuperForJava {

    @SentinelResource(value = "demo")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun classHandler(name: String?, e: Throwable?): String

    abstract fun classHandler(name: String?): String

}