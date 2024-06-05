package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.Nullable;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

public class OFCSCHFPSCJavaParentForKotlin {
    private void blockHandler(@Nullable String str, BlockException e) {
        doBlockHandle(str, e);
    }

    private void fallback(String str) {
        doFallback(str);
    }
}
