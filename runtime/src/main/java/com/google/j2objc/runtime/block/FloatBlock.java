package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code float}. This is used 
 * to map the Objective-C {@code float (^)(void)} block type.
 */
public interface FloatBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    float run();
}
