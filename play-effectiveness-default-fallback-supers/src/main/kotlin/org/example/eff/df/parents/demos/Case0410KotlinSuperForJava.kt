// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.parents.biz.Greeting

/**
 * Case: Case(sn=0410, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
abstract class Case0410KotlinSuperForJava {

    @SentinelResource(value = "demo", defaultFallback = "superMethodHandler")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
