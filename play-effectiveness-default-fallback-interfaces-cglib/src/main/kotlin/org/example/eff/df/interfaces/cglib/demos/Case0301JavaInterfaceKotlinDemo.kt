// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0301, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
class Case0301JavaInterfaceKotlinDemo : Case0301JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
