package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 2 generic arguments and returns a generic value.
 */
public interface Block2<A, B, R> {

    /**
     * Invokes this block.
     * 
     * @param a block argument number 1.
     * @param b block argument number 2.
     * @return the block return value.
     */
    @Mapping("run:param:")
    R run(A a, B b);
}
