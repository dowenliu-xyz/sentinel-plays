package org.example.demo.biz;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Greeting {
    public static @NotNull String doGreeting(String name) {
        return "Hello " + name + "!";
    }

    public static String doBlockHandle(String name, BlockException e) {
        return "blocked";
    }
}
