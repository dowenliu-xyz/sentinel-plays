// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0714, classAnnoOnSuper=WithoutAttr, originMethodInSuper=None, handlerInSuper=None, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo")
@Component
class Case0714KotlinInterfaceKotlinDemo : Case0714KotlinInterfaceForKotlin {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

}
