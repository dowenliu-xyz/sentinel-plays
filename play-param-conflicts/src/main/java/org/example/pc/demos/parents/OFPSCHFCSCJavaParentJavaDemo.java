package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;
import static org.example.pc.biz.Biz.doFallback;

@Component
public class OFPSCHFCSCJavaParentJavaDemo extends OFPSCHFCSCJavaParentForJava implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }

    private void blockHandler(@Nullable String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private void blockHandler(@Nullable Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private void fallback(String str) {
        doFallback(str);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
