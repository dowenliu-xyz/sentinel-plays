// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.springframework.stereotype.Component

/**
 * Case: Case(sn=0728, classAnnoOnSuper=None, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithAttr, originMethodInClass=None, hasHandlerInClass=false)
 */
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
class Case0728KotlinSuperKotlinDemo : Case0728KotlinSuperForKotlin()
