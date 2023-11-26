package org.apache.hadoop.util.functional;

import java.io.IOException;

/**
 * Function of arity 1 which may raise an IOException.
 * @param <T> type of arg1
 * @param <R> type of return value.
 */
@FunctionalInterface
public interface FunctionRaisingIOE<T, R> {

  /**
   * Apply the function.
   * @param t argument 1
   * @return result
   * @throws IOException Any IO failure
   */
  R apply(T t) throws IOException;
}
