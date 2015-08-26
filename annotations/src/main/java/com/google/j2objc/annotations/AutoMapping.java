package com.google.j2objc.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Created by Aaron on 8/21/15.
 */

@Target({CONSTRUCTOR, METHOD})
@Retention(SOURCE)
public @interface AutoMapping {
    /**
     * The signature the annotated Constructor and Selector will map to initWithxx:withxx:
     */
}


