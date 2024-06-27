package org.example.eff.df.combine.demos.case01;

import org.example.eff.df.combine.biz.Greeting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Case01JavaSuperJavaInterfaceJavaDemo extends JavaSuper implements JavaInterface {
    @NotNull
    public String handlerBySuper(@Nullable Throwable e) {
        return "bySuper:" + Greeting.doDefaultFallback(e);
    }

    @NotNull
    public String handlerByInterface(@Nullable Throwable e) {
        return "byInterface:" + Greeting.doDefaultFallback(e);
    }
}
