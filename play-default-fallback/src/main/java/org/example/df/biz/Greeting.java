package org.example.df.biz;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Greeting {
    public static @NotNull String doGreeting(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is null or empty");
        return "Hello " + name + "!";
    }

    public static String doDefaultFallback(Throwable e) {
        return "with error";
    }
}
