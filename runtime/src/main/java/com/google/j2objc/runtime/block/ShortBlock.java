package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code short}. This is used 
 * to map the Objective-C {@code short (^)(void)} block type.
 */
public interface ShortBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    short run();
}
