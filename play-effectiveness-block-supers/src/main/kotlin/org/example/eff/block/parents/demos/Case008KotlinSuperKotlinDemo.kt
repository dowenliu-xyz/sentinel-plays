// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=008, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
class Case008KotlinSuperKotlinDemo : Case008KotlinSuperForKotlin()
