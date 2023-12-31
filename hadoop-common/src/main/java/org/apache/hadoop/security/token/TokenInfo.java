package org.apache.hadoop.security.token;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates Token related information to be used
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TokenInfo {
  /** The type of TokenSelector to be used */
  Class<? extends TokenSelector<? extends TokenIdentifier>> value();
}