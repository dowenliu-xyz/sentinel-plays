// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=433, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
interface Case433KotlinInterfaceForKotlin {

    fun greeting(name: String?): String

    fun classHandler(name: String?, e: BlockException?): String

    fun methodHandler(name: String?, e: BlockException?): String

}
