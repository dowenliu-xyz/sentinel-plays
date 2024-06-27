// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.EffAnno
import org.example.eff.block.parents.biz.Greeting
import org.example.eff.block.parents.biz.HandlerLocation
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=257, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case257JavaSuperKotlinDemo : Case257JavaSuperForKotlin() {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    override fun greeting(name: String?): String {
        return Greeting.doGreeting(name)
    }

    override fun superMethodHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    override fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

    override fun methodHandler(name: String?, e: BlockException?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Class.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
