package org.apache.hadoop.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates Kerberos related information to be used
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// MapReduce也可见
public @interface KerberosInfo {
  /** Key for getting server's Kerberos principal name from Configuration */
  String serverPrincipal();

  String clientPrincipal() default "";
}
