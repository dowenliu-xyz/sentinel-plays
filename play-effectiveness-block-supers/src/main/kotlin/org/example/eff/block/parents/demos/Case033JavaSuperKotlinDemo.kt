// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.EffAnno
import org.example.eff.block.parents.biz.Greeting
import org.example.eff.block.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=033, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@Component
class Case033JavaSuperKotlinDemo : Case033JavaSuperForKotlin() {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    fun superClassHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    fun superMethodHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    fun methodHandler(name: String?, e: BlockException?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
