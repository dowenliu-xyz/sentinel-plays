// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.interfaces.cglib.biz.EffAnno
import org.example.eff.block.interfaces.cglib.biz.Greeting
import org.example.eff.block.interfaces.cglib.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=215, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case215KotlinInterfaceKotlinDemo : Case215KotlinInterfaceForKotlin {

    fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun superClassHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    override fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
