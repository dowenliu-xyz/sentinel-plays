// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;


/**
 * Case: Case(sn=235, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=None, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", fallback = "superClassHandler")
public abstract class Case235JavaSuperForJava {

}
