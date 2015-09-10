package com.google.j2objc.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Created by aaron on 9/7/15.
 */
@Target({TYPE})
@Retention(SOURCE)
public @interface CategoryOn {
  public Class value();
}
