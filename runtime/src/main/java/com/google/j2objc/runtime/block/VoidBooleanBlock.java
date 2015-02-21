package com.google.j2objc.runtime.block;

import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code boolean} argument and returns no value. 
 * This is used to map the Objective-C {@code void (^)(BOOL)} block type.
 */
public interface VoidBooleanBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(boolean v);
}
