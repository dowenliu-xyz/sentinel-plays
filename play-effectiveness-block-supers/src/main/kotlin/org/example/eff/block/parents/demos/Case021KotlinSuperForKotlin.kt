// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.Greeting

/**
 * Case: Case(sn=021, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
abstract class Case021KotlinSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    abstract fun superClassHandler(name: String?, e: BlockException?): String

    abstract fun superMethodHandler(name: String?, e: BlockException?): String

    abstract fun methodHandler(name: String?, e: BlockException?): String

}
