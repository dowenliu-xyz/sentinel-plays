// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=268, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
interface Case268KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    fun greeting(name: String?): String

    fun superMethodHandler(name: String?, e: BlockException?): String

}
