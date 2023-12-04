package org.apache.hadoop.io.retry;

import java.lang.annotation.*;

/**
 * Used to mark certain methods of an interface as being idempotent, and
 * therefore warrant being retried on failover.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Idempotent {
}
