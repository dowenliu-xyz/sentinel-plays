// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=0545, classAnnoOnSuper=WithoutAttr, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo")
abstract class Case0545KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    abstract fun classHandler(e: Throwable?): String

    abstract fun classHandler(): String

}
