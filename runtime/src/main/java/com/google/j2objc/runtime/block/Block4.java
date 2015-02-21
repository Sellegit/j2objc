package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 4 generic arguments and returns a generic value.
 */
public interface Block4<A, B, C, D, R> {

    /**
     * Invokes this block.
     * 
     * @param a block argument number 1.
     * @param b block argument number 2.
     * @param c block argument number 3.
     * @param d block argument number 4.
     * @return the block return value.
     */
    @Mapping("run:param:param:param:")
    R run(A a, B b, C c, D d);
}
