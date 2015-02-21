package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code double} argument and returns no value.
 * This is used to map the Objective-C {@code void (^)(double)} block type.
 */
public interface VoidDoubleBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(double v);
}
