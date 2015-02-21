package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 1 generic argument and returns no value.
 */
public interface VoidBlock1<A> {

    /**
     * Invokes this block.
     * 
     * @param a the block argument.
     */
    @Mapping("run:")
    void run(A a);
}
