package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code boolean}. This is used 
 * to map the Objective-C {@code BOOL (^)(void)} block type.
 */
public interface BooleanBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    boolean run();
}
