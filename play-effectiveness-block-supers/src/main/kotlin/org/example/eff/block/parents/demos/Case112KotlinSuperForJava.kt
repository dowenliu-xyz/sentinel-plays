// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.EffAnno
import org.example.eff.block.parents.biz.Greeting
import org.example.eff.block.parents.biz.HandlerLocation

/**
 * Case: Case(sn=112, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
abstract class Case112KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    open fun superClassHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

    open fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

    open fun methodHandler(name: String?, e: BlockException?): String {
        return EffAnno.MethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
