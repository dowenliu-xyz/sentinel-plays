// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0093, classAnnoOnSuper=WithAttr, originMethodInSuper=WithAnnoHavingAttrAbstract, handlerInSuper=None, classAnnoOnClass=WithAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", defaultFallback = "classHandler")
@Component
public class Case0093KotlinSuperJavaDemo extends Case0093KotlinSuperForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
