package org.example.bh.demos.interfaces;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import static org.example.bh.biz.Greeting.doBlockHandle;

/**
 * case interface: Annotation in Class and Fallback in Interface
 * <br/>
 * Aspect takes effect, but the fallback method can not be found.
 */
@SuppressWarnings("unused")
public interface ACFIJavaInterfaceForJava {
    String greeting(String name);

    default String blockHandler(String name, BlockException e) {
        return doBlockHandle(name, e);
    }
}
