// Generated by generateDemo task, DO NOT MODIFY
package org.example.eff.fallback.interfaces.cglib.demos;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import static org.example.eff.fallback.interfaces.cglib.biz.Greeting.doGreeting;

/**
 * Case: Case(sn=394, hasClassAnnoOnSuper=false, originMethodInSuper=WithoutAnnoWithBody, handlerInSuper=WithBody, hasClassAnnoOnClass=false, originMethodInClass=WithoutAnno, hasHandlerInClass=false)
 */
@SuppressWarnings("unused")
@Component
public class Case394JavaInterfaceJavaDemo implements Case394JavaInterfaceForJava {

    @Override
    @NotNull
    public String greeting(@Nullable String name) {
        return doGreeting(name);
    }

}