// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.slots.block.BlockException

/**
 * Case: Case(sn=435, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoAbstract, handlerInSuper=Abstract, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
abstract class Case435KotlinSuperForJava {

    abstract fun greeting(name: String?): String

    abstract fun classHandler(name: String?, e: BlockException?): String

}