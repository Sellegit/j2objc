package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code double}. This is used 
 * to map the Objective-C {@code double (^)(void)} block type.
 */
public interface DoubleBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    double run();
}
