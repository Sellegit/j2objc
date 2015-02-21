package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code float} argument and returns no value.
 * This is used to map the Objective-C {@code void (^)(float)} block type.
 */
public interface VoidFloatBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(float v);
}
