// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.jdk.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=008, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", fallback = "classHandler")
@Component
class Case008KotlinInterfaceKotlinDemo : Case008KotlinInterfaceForKotlin
