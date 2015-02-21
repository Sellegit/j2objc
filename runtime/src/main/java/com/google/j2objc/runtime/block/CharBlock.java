package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns a {@code char}. This is used 
 * to map the Objective-C {@code unsigned short (^)(void)} block type.
 */
public interface CharBlock {

    /**
     * Runs this block.
     * 
     * @return the block return value.
     */
    @Mapping("run")
    char run();
}
