package org.apache.hadoop.util.functional;

import java.io.IOException;

/**
 * Function of arity 2 which may raise an IOException.
 * @param <T> type of arg1
 * @param <U> type of arg2
 * @param <R> type of return value.
 */
@FunctionalInterface
public interface BiFunctionRaisingIOE<T, U, R> {

  /**
   * Apply the function.
   * @param t argument 1
   * @param u argument 2
   * @return result
   * @throws IOException Any IO failure
   */
  R apply(T t, U u) throws IOException;
}
