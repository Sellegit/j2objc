package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code byte}. This is used 
 * to map the Objective-C {@code char (^)(void)} block type.
 */
public interface ByteBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    byte run();
}
