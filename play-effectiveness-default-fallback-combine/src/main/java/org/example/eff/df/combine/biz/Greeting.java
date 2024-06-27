package org.example.eff.df.combine.biz;

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
    public static String doDefaultFallback(@Nullable Throwable ignored) {
        return "defaultFallback with error";
    }

    @NotNull
    public static String doDefaultFallback() {
        return "defaultFallback without error";
    }
}
