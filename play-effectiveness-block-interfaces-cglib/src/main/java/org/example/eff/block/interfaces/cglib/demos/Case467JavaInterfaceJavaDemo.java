// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.block.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.block.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=467, hasClassAnnoOnSuper=false, originMethodInSuper=None, handlerInSuper=Abstract, hasClassAnnoOnClass=false, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=true)
 */
@SuppressWarnings("unused")
@Component
public class Case467JavaInterfaceJavaDemo implements Case467JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
