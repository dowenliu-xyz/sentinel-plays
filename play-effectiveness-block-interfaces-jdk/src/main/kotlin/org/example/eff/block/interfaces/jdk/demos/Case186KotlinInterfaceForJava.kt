// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.interfaces.jdk.biz.EffAnno
import org.example.eff.block.interfaces.jdk.biz.Greeting
import org.example.eff.block.interfaces.jdk.biz.HandlerLocation

/**
 * Case: Case(sn=186, hasClassAnnoOnSuper=true, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
interface Case186KotlinInterfaceForJava {

    fun greeting(name: String?): String

    fun superClassHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

    fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
