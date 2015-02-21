package com.google.j2objc.runtime.block;


import com.google.j2objc.annotations.Mapping;

/**
 * Block which takes 5 generic arguments and returns no value.
 */
public interface VoidBlock5<A, B, C, D, E> {

    /**
     * Invokes this block.
     * 
     * @param a block argument number 1.
     * @param b block argument number 2.
     * @param c block argument number 3.
     * @param d block argument number 4.
     * @param e block argument number 5.
     */
    @Mapping("run:param:param:param:param:")
    void run(A a, B b, C c, D d, E e);
}
