// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=295, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case295KotlinSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    abstract fun greeting(name: String?): String

    abstract fun superMethodHandler(name: String?, e: BlockException?): String

    abstract fun classHandler(name: String?, e: BlockException?): String

}
