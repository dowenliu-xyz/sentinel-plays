package org.example.bh.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

import static org.example.bh.biz.Greeting.doBlockHandle;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForKotlin {
    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
