// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.block.interfaces.jdk.biz.Greeting

/**
 * Case: Case(sn=108, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
interface Case108KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
