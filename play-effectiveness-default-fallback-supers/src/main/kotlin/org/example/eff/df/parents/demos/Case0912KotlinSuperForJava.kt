// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0912, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=None, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case0912KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

}
