package org.example.eff.block.combine.demos.case01;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.eff.block.combine.biz.Greeting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Case01JavaSuperJavaInterfaceJavaDemo extends JavaSuper implements JavaInterface {
    @NotNull
    public String handlerBySuper(@Nullable String name, @Nullable BlockException e) {
        return "bySuper:" + Greeting.doBlockHandler(name, e);
    }

    @NotNull
    public String handlerByInterface(@Nullable String name, @Nullable BlockException e) {
        return "byInterface:" + Greeting.doBlockHandler(name, e);
    }
}
