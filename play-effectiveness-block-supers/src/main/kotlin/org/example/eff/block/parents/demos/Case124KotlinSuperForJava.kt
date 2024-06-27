// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=124, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", blockHandler = "superClassHandler")
abstract class Case124KotlinSuperForJava {

    @SentinelResource(value = "demo")
    abstract fun greeting(name: String?): String

    abstract fun superClassHandler(name: String?, e: BlockException?): String

    abstract fun classHandler(name: String?, e: BlockException?): String

}
