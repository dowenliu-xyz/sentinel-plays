// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.interfaces.jdk.biz.EffAnno
import org.example.eff.block.interfaces.jdk.biz.Greeting
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=213, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case213JavaInterfaceKotlinDemo : Case213JavaInterfaceForKotlin {

    @SentinelResource(value = "demo")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun superMethodHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    override fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
