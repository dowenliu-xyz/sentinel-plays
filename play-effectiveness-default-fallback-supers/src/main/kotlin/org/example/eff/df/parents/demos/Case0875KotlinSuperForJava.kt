// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting

/**
 * Case: Case(sn=0875, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
abstract class Case0875KotlinSuperForJava {

    @SentinelResource(value = "demo")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}