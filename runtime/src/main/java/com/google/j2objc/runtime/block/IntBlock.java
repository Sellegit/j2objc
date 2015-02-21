package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns an {@code int}. This is used 
 * to map the Objective-C {@code int (^)(void)} block type.
 */
public interface IntBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    int run();
}
