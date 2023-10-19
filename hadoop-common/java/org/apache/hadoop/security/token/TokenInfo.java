package org.apache.hadoop.security.token;

import java.lang.annotation.*;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Indicates Token related information to be used
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@InterfaceAudience.Public
@InterfaceStability.Evolving
public @interface TokenInfo {
  /** The type of TokenSelector to be used */
  Class<? extends TokenSelector<? extends TokenIdentifier>> value();
}