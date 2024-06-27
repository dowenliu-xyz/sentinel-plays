package org.example.eff.fallback.combine.demos.case01;

import org.example.eff.fallback.combine.biz.Greeting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Case01JavaSuperJavaInterfaceJavaDemo extends JavaSuper implements JavaInterface {
    @NotNull
    public String handlerBySuper(@Nullable String name, @Nullable Throwable e) {
        return "bySuper:" + Greeting.doFallback(name, e);
    }

    @NotNull
    public String handlerByInterface(@Nullable String name, @Nullable Throwable e) {
        return "byInterface:" + Greeting.doFallback(name, e);
    }
}
