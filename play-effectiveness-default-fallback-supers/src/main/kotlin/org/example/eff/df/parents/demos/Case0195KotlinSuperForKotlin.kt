// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0195, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
abstract class Case0195KotlinSuperForKotlin {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

}
