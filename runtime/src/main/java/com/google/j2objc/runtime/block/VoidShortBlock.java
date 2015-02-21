package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code short} argument and returns no value.
 * This is used to map the Objective-C {@code void (^)(short)} block type.
 */
public interface VoidShortBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(short v);
}
