// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=433, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
abstract class Case433KotlinSuperForJava {

    abstract fun greeting(name: String?): String

    abstract fun classHandler(name: String?, e: BlockException?): String

    abstract fun methodHandler(name: String?, e: BlockException?): String

}
