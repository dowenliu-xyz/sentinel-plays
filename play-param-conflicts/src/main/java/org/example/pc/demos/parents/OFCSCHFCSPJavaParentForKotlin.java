package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.jetbrains.annotations.Nullable;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

public class OFCSCHFCSPJavaParentForKotlin {
    private void blockHandler(@Nullable Integer integer, BlockException e) {
        doBlockHandle(integer, e);
    }

    private void fallback(Integer integer) {
        doFallback(integer);
    }
}
