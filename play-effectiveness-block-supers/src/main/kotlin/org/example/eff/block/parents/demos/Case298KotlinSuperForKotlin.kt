// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=298, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case298KotlinSuperForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    abstract fun greeting(name: String?): String

    abstract fun superMethodHandler(name: String?, e: BlockException?): String

}
