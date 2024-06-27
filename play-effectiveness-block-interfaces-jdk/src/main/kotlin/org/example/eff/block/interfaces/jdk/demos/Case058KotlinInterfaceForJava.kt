// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=058, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
interface Case058KotlinInterfaceForJava {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    fun greeting(name: String?): String

    fun superClassHandler(name: String?, e: BlockException?): String

    fun superMethodHandler(name: String?, e: BlockException?): String

}
