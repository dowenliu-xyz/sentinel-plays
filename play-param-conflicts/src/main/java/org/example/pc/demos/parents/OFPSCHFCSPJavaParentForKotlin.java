package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.Nullable;

import static org.example.pc.biz.Biz.*;

public class OFPSCHFCSPJavaParentForKotlin {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }

    private void blockHandler(@Nullable Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
