// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.interfaces.cglib.biz.Greeting

/**
 * Case: Case(sn=262, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case262KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    fun superMethodHandler(name: String?, e: BlockException?): String

}
