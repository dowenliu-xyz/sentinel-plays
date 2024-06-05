package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

@Component
public class OFPSPHFCSPJavaParentJavaDemo extends OFPSPHFCSPJavaParentForJava implements Demo {
    private void blockHandler(@Nullable String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private void fallback(String str) {
        doFallback(str);
    }
}
