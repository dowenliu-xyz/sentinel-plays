package org.example.eff.df.basic.biz;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public final class Run {
    private Run() {
        throw new UnsupportedOperationException("Cannot instantiate utility class.");
    }

    public static void expectDefaultFallback(Function<String, String> function, AnnoType annoType) {
        String result = function.apply("");
        String expect = annoType.name() + ":defaultFallback without error";
        if (!expect.equals(result)) {
            throw new IllegalStateException("expect \"" + expect + "\", but got: \"" + result + "\"");
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
