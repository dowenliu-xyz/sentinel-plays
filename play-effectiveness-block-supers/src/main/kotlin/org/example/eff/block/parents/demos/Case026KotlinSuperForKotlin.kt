// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting

/**
 * Case: Case(sn=026, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
abstract class Case026KotlinSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
