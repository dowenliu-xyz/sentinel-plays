// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=377, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
interface Case377KotlinInterfaceForKotlin {

    @SentinelResource(value = "demo")
    fun greeting(name: String?): String

}
