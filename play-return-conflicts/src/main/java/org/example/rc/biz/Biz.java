package org.example.rc.biz;

public class Biz {
    public static String doFirst() {
        throw new IllegalStateException("biz error");
    }

    public static Integer doSecond() {
        throw new IllegalStateException("biz error");
    }

    public static String doFirstFallback() {
        return "fallback";
    }

    public static Integer doSecondFallback() {
        return 0;
    }
}
