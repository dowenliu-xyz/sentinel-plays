// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.interfaces.jdk.biz.EffAnno
import org.example.eff.block.interfaces.jdk.biz.Greeting
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=321, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case321KotlinInterfaceForJava {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

    fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

    fun methodHandler(name: String?, e: BlockException?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
