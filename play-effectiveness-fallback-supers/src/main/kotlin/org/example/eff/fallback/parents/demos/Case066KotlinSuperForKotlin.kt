// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=066, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case066KotlinSuperForKotlin {

    @SentinelResource(value = "demo", fallback = "superMethodHandler")
    abstract fun greeting(name: String?): String

}
