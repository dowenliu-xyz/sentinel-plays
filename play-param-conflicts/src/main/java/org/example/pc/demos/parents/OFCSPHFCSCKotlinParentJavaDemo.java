package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.*;

@Component
public class OFCSPHFCSCKotlinParentJavaDemo extends OFCSPHFCSCKotlinParentForJava implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
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
