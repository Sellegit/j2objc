package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 1 generic argument and returns a generic value.
 */
public interface Block1<A, R> {

    /**
     * Invokes this block.
     * 
     * @param a the block argument.
     * @return the block return value.
     */
    @Mapping("run:")
    R run(A a);
}
