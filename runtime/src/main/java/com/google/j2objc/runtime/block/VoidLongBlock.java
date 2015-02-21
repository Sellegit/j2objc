package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code long} argument and returns no value.
 * This is used to map the Objective-C {@code void (^)(long long)} block type.
 */
public interface VoidLongBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(long v);
}
