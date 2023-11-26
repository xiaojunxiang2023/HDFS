package org.apache.hadoop.fs.impl;

import java.io.IOException;

/**
 * Support for functional programming/lambda-expressions.
 * @deprecated use {@code org.apache.hadoop.util.functional}
 */
public final class FunctionsRaisingIOE {

  private FunctionsRaisingIOE() {
  }

  /**
   * Function of arity 1 which may raise an IOException.
   * @param <T> type of arg1
   * @param <R> type of return value.
   * @deprecated use {@link org.apache.hadoop.util.functional.FunctionRaisingIOE}
   */
  @FunctionalInterface
  public interface FunctionRaisingIOE<T, R> {

    R apply(T t) throws IOException;
  }

  /**
   * Function of arity 2 which may raise an IOException.
   * @param <T> type of arg1
   * @param <U> type of arg2
   * @param <R> type of return value.
   * @deprecated use {@link org.apache.hadoop.util.functional.BiFunctionRaisingIOE}
   */
  @FunctionalInterface
  public interface BiFunctionRaisingIOE<T, U, R> {

    R apply(T t, U u) throws IOException;
  }

  /**
   * This is a callable which only raises an IOException.
   * @param <R> return type
   * @deprecated use {@link org.apache.hadoop.util.functional.CallableRaisingIOE}
   */
  @FunctionalInterface
  public interface CallableRaisingIOE<R> {

    R apply() throws IOException;
  }

}
