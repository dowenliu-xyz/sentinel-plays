// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0894, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
abstract class Case0894KotlinSuperForKotlin {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

}
