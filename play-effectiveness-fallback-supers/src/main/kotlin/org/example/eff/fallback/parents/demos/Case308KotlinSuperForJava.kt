// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=308, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
abstract class Case308KotlinSuperForJava {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    abstract fun greeting(name: String?): String

}
