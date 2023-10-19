package org.apache.hadoop.util.functional;

import java.io.IOException;

/**
 * This is a callable which only raises an IOException.
 * @param <R> return type
 */
@FunctionalInterface
public interface CallableRaisingIOE<R> {

  /**
   * Apply the operation.
   * @return result
   * @throws IOException Any IO failure
   */
  R apply() throws IOException;
}
