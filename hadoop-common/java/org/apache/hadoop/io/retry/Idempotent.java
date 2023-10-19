package org.apache.hadoop.io.retry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Used to mark certain methods of an interface as being idempotent, and
 * therefore warrant being retried on failover.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@InterfaceStability.Evolving
public @interface Idempotent {}
