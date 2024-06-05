package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doConsumeString;

@Component
public class OFCSPHFPSPKotlinParentJavaDemo extends OFCSPHFPSPKotlinParentForJava implements Demo {
    @SentinelResource(blockHandler = "blockHandler", fallback = "fallback")
    public void consumeString(@Nullable String str) {
        doConsumeString(str);
    }
}
