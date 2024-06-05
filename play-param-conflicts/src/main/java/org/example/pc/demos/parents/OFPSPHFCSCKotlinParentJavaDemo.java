package org.example.pc.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.pc.biz.Demo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import static org.example.pc.biz.Biz.doBlockHandle;
import static org.example.pc.biz.Biz.doFallback;

@Component
public class OFPSPHFCSCKotlinParentJavaDemo extends OFPSPHFCSCKotlinParentForJava implements Demo {

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
