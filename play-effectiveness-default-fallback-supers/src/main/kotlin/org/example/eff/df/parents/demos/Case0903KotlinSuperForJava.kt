// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0903, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
abstract class Case0903KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

}