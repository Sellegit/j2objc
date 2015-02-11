package com.google.j2objc.annotations;

/**
 * used to denote that a certain parameter is to be interpreted as a block
 */
public @interface Block {
  String ret() default "void";

  String[] params() default {};
}
