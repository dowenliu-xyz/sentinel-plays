// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=294, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
abstract class Case294KotlinSuperForJava {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    abstract fun greeting(name: String?): String

    abstract fun superMethodHandler(name: String?, e: BlockException?): String

    abstract fun classHandler(name: String?, e: BlockException?): String

}
