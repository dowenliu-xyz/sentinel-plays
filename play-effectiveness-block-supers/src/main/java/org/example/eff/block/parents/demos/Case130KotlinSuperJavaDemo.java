// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.parents.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.parents.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=130, hasClassAnnoOnSuper=true, originMethodInSuper=WithAnnoNoAttrAbstract, handlerInSuper=None, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
public class Case130KotlinSuperJavaDemo extends Case130KotlinSuperForJava {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
