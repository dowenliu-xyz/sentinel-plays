// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.example.eff.df.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=0254, classAnnoOnSuper=WithAttr, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "superClassHandler")
interface Case0254KotlinInterfaceForJava {

    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

}
