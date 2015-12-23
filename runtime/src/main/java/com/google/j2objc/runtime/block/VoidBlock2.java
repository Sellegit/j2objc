package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;


/**
 * Block which takes 2 generic arguments and returns no value.
 */
public interface VoidBlock2<A, B> {

    /**
     * Invokes this block.
     *  @param a block argument number 1.
     * @param b block argument number 2.
     */
    @Mapping("run:param:")
    void run(A a, B b);
}
