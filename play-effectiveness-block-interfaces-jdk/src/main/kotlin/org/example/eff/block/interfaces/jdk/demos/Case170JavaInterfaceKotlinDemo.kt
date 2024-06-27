// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.interfaces.jdk.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=170, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case170JavaInterfaceKotlinDemo : Case170JavaInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
