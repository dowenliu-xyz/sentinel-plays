// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.parents.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=234, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case234KotlinSuperKotlinDemo : Case234KotlinSuperForKotlin() {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
