package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes a single {@code char} argument and returns no value.
 * This is used to map the Objective-C {@code void (^)(unsigned short)} block type.
 */
public interface VoidCharBlock {

    /**
     * Runs this block.
     * 
     * @param v the block argument.
     */
    @Mapping("run:")
    void run(char v);
}
