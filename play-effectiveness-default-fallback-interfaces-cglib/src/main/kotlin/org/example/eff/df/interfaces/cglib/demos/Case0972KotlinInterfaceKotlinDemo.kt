// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0972, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
class Case0972KotlinInterfaceKotlinDemo : Case0972KotlinInterfaceForKotlin {

    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}