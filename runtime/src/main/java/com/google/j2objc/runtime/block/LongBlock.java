package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code long}. This is used 
 * to map the Objective-C {@code long long (^)(void)} block type.
 */
public interface LongBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    long run();
}
