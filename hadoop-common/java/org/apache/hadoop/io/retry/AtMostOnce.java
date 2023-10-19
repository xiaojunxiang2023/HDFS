package org.apache.hadoop.io.retry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Used to mark certain methods of an interface with at-most-once semantics.
 * 
 * Server must guarantee that methods are executed at most once, by keeping
 * a retry cache. The previous response must be returned when duplicate 
 * requests are received. Because of these guarantee, a client can retry
 * this request on failover and other network failure conditions.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@InterfaceStability.Evolving
public @interface AtMostOnce {

}
