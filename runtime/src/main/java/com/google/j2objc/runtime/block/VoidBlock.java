package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes no arguments and returns no value. This is used to map the
 * Objective-C {@code void (^)(void)} block type.
 */
public interface VoidBlock {

    /**
     * Invokes this block.
     */
    @Mapping("run")
    void run();
}
