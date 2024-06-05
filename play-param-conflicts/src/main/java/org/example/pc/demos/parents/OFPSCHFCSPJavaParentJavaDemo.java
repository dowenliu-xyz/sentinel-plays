package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

@Component
public class OFPSCHFCSPJavaParentJavaDemo extends OFPSCHFCSPJavaParentForJava implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeInteger(@Nullable Integer integer) {
        doConsumeInteger(integer);
    }

    private void blockHandler(@Nullable String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private void fallback(String str) {
        doFallback(str);
    }
}
