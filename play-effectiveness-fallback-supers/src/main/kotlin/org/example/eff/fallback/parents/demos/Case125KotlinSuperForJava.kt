// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=125, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
abstract class Case125KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(name: String?, e: Throwable?): String

    abstract fun superClassHandler(name: String?): String

    abstract fun classHandler(name: String?, e: Throwable?): String

    abstract fun classHandler(name: String?): String

}
