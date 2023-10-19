package org.apache.hadoop.security;

import java.lang.annotation.*;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Indicates Kerberos related information to be used
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public @interface KerberosInfo {
  /** Key for getting server's Kerberos principal name from Configuration */
  String serverPrincipal();
  String clientPrincipal() default "";
}
