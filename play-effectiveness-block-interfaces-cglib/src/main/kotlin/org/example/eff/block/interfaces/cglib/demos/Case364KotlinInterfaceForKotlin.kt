// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=364, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case364KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

    fun classHandler(name: String?, e: BlockException?): String

}
