package org.example.demo.demos.parents;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

import static org.example.demo.biz.Greeting.doBlockHandle;

/**
 * case: Annotation in Child and Fallback in Parent
 */
@SuppressWarnings("unused")
@Slf4j
public class ACFPJavaParentForJava {
    private String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
