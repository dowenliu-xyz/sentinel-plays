// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.slots.block.BlockException
import org.example.eff.block.parents.biz.EffAnno
import org.example.eff.block.parents.biz.Greeting
import org.example.eff.block.parents.biz.HandlerLocation

/**
 * Case: Case(sn=388, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=false)
 */
abstract class Case388KotlinSuperForKotlin {

    open fun greeting(name: String?): String = "super:" + Greeting.doGreeting(name)

    open fun classHandler(name: String?, e: BlockException?): String {
        return EffAnno.ClassAnno.name + ":" + HandlerLocation.Super.name + ":" + Greeting.doBlockHandler(name, e)
    }

}