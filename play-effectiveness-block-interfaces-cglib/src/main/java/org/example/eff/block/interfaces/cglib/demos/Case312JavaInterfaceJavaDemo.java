// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=312, hasClassAnnoOnSuper=false, originMethodInSuper=WithAnnoNoAttrWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=true, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo", blockHandler = "classHandler")
@Component
public class Case312JavaInterfaceJavaDemo implements Case312JavaInterfaceForJava {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
