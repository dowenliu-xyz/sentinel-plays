// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0901, classAnnoOnSuper=None, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
abstract class Case0901KotlinSuperForKotlin {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

}
