// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.fallback.parents.biz.Greeting

/**
 * Case: Case(sn=090, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case090KotlinSuperForJava {

    @SentinelResource(value = "demo")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun superClassHandler(name: String?, e: Throwable?): String

    abstract fun superClassHandler(name: String?): String

    abstract fun classHandler(name: String?, e: Throwable?): String

    abstract fun classHandler(name: String?): String

}
