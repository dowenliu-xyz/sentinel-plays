// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=218, hasClassAnnoOnSuper=true, originMethodInSuper=None, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoHavingAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case218JavaInterfaceJavaDemo implements Case218JavaInterfaceForJava {

    @SentinelResource(value = "demo", blockHandler = "methodHandler")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
