// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=236, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@Component
class Case236KotlinSuperKotlinDemo : Case236KotlinSuperForKotlin() {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}