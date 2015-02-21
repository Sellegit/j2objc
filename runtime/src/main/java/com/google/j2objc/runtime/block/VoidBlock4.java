package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 4 generic arguments and returns no value.
 */
public interface VoidBlock4<A, B, C, D> {

    /**
     * Invokes this block.
     * 
     * @param a block argument number 1.
     * @param b block argument number 2.
     * @param c block argument number 3.
     * @param d block argument number 4.
     */
    @Mapping("run:param:param:param:")
    void run(A a, B b, C c, D d);
}
