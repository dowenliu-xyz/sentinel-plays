// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0314, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0314KotlinSuperForJava {

    abstract fun greeting(name: String?): String

}
