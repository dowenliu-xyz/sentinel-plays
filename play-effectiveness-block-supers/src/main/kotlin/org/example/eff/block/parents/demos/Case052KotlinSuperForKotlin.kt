// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.EffAnno
import org.example.eff.block.parents.biz.Greeting
import org.example.eff.block.parents.biz.HandlerLocation

/**
 * Case: Case(sn=052, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
abstract class Case052KotlinSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    abstract fun greeting(name: String?): String

    open fun superClassHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

    open fun superMethodHandler(name: String?, e: BlockException?): String {
        return EffAnno.SuperMethodAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

}
