// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting

/**
 * Case: Case(sn=0235, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0235KotlinSuperForJava {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun superClassHandler(e: Throwable?): String

    abstract fun superClassHandler(): String

    abstract fun classHandler(e: Throwable?): String

    abstract fun classHandler(): String

    abstract fun methodHandler(e: Throwable?): String

    abstract fun methodHandler(): String

}