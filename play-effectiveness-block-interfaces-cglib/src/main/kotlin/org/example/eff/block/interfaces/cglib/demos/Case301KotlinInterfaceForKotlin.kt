// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=301, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case301KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo", blockHandler = "superMethodHandler")
    fun greeting(name: String?): String

}
