// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource

/**
 * Case: Case(sn=239, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=true)
 */
@SentinelResource(value = "demo", fallback = "superClassHandler")
interface Case239KotlinInterfaceForKotlin
