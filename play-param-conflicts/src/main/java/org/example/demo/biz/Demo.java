package org.example.demo.biz;

import org.jetbrains.annotations.Nullable;

public interface Demo {
    void consumeString(@Nullable String str);

    void consumeInteger(@Nullable Integer integer);
}
