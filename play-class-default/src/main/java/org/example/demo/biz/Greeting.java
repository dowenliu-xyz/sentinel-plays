package org.example.demo.biz;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Greeting {
    public static @NotNull String doGreeting(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is null or empty");
        return "Hello " + name + "!";
    }

    public static @NotNull String doDefaultFallback() {
        return "without error";
    }

    public static @NotNull String doDefaultFallback(Throwable throwable) {
        return "with error";
    }
}
