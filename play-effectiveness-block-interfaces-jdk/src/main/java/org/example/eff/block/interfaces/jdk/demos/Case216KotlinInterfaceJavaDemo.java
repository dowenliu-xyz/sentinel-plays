// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=216, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoHavingAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
public class Case216KotlinInterfaceJavaDemo implements Case216KotlinInterfaceForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
