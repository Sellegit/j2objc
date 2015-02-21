package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no generic arguments and returns a generic value.
 */
public interface Block0<R> {

    /**
     * Invokes this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    R run();
}
