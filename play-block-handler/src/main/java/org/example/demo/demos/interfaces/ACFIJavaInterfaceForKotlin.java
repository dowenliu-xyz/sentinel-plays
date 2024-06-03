package org.example.demo.demos.interfaces;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import static org.example.demo.biz.Greeting.doBlockHandle;

/**
 * case interface: Annotation in Class and Fallback in Interface
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForKotlin {
    String greeting(String name);

    default String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
