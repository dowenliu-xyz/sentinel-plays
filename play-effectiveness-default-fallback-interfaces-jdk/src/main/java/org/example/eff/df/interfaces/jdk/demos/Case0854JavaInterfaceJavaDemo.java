// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.df.interfaces.jdk.demos;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.df.interfaces.jdk.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=0854, classAnnoOnSuper=None, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, classAnnoOnClass=WithoutAttr, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@SentinelResource(value = "demo")
@Component
public class Case0854JavaInterfaceJavaDemo implements Case0854JavaInterfaceForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}
