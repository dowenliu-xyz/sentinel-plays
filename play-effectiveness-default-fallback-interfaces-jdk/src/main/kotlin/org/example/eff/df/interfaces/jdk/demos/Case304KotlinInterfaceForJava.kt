// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=304, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=None, hasHandlerInClass=true)
 */
interface Case304KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
