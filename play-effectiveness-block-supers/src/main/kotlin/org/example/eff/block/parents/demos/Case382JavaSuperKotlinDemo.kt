// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=382, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case382JavaSuperKotlinDemo : Case382JavaSuperForKotlin() {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
