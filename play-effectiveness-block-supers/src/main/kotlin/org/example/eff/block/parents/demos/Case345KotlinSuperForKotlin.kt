// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting

/**
 * Case: Case(sn=345, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
abstract class Case345KotlinSuperForKotlin {

    @SentinelResource(value = "demo")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
