// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.cglib.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0331, classAnnoOnSuper=WithAttr, originMethodInSuper=None, handlerInSuper=WithBody, classAnnoOnClass=None, originMethodInClass=WithAnnoNoAttr, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case0331JavaInterfaceJavaDemo implements Case0331JavaInterfaceForJava {

    @SentinelResource(value = "demo")
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
