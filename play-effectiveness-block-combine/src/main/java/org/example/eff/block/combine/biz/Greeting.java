package org.example.eff.block.combine.biz;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Greeting {
    private Greeting() {
        throw new UnsupportedOperationException("no instance for you.");
    }

    @NotNull
    public static String doGreeting(@Nullable String name) {
        if (name == null || name.isBlank()) {
            throw new BizException("name should not be null nor blank");
        }
        return "Hello " + name + "!";
    }

    @NotNull
    public static String doBlockHandler(@Nullable String ignoredName, @Nullable BlockException ignored) {
        return "blocked";
    }
}
