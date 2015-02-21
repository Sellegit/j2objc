package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 5 generic arguments and returns a generic value.
 */
public interface Block5<A, B, C, D, E, R> {

    /**
     * Invokes this block.
     * 
     * @param a block argument number 1.
     * @param b block argument number 2.
     * @param c block argument number 3.
     * @param e block argument number 5.
     * @return the block return value.
     */
    @Mapping("run:param:param:param:param:")
    R run(A a, B b, C c, D d, E e);
}
