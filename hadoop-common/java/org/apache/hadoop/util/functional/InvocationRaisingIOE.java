package org.apache.hadoop.util.functional;

import java.io.IOException;

/**
 * This is a lambda-expression which may raises an IOException.
 * This is a recurrent design patten in the hadoop codebase, e.g
 * {@code LambdaTestUtils.VoidCallable} and
 * the S3A {@code Invoker.VoidOperation}}. Hopefully this should
 * be the last.
 * Note for implementors of methods which take this as an argument:
 * don't use method overloading to determine which specific functional
 * interface is to be used.
 */
@FunctionalInterface
public interface InvocationRaisingIOE {

  /**
   * Apply the operation.
   * @throws IOException Any IO failure
   */
  void apply() throws IOException;

}
