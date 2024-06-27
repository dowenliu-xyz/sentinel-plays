package org.example.eff.block.basic.biz;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public final class Run {
    private Run() {
        throw new UnsupportedOperationException("Cannot instantiate utility class.");
    }

    public static void expectBlockHandle(Function<String, String> function) {
        String result = function.apply("");
        if (!"blocked".equals(result)) {
            throw new IllegalStateException("expect \"blocked\", but got: \"" + result + "\"");
        }
    }

    public static void expectAspectNotTakeEffect(Function<String, String> function) {
        expectThrows(function, e -> {
            if (!(e instanceof BizException)) {
                return false;
            }
            return Arrays.stream(e.getStackTrace()).noneMatch(s -> s.getClassName().contains("SentinelResourceAspect"));
        });
    }

    private static void expectThrows(Function<String, String> function, Predicate<Throwable> predicate) {
        String result;
        try {
            result = function.apply("");
        } catch (Throwable e) {
            if (predicate.test(e)) return;
            throw new AssertionError("unexpect", e);
        }
        throw new AssertionError("expect exception, but got normal result: " + result);
    }
}
