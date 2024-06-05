package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.jetbrains.annotations.Nullable;

import static org.example.pc.biz.Biz.doConsumeString;

public class OFPSCHFCSCJavaParentForJava {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }
}
