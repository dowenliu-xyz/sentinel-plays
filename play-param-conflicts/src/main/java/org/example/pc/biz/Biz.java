package org.example.pc.biz;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class Biz {
    public static void doConsumeString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("str should not be null or blank");
        }
    }

    public static void doConsumeInteger(Integer integer) {
        if (integer == null || integer <= 0) {
            throw new IllegalArgumentException("integer should not be null");
        }
    }

    public static void doFallback(@SuppressWarnings("unused") String str) {
    }

    public static void doFallback(@SuppressWarnings("unused") Integer integer) {
    }

    @SuppressWarnings("unused")
    public static void doBlockHandle(String str, BlockException e) {
    }

    @SuppressWarnings("unused")
    public static void doBlockHandle(Integer integer, BlockException e) {
    }
}
