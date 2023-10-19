package org.apache.hadoop.util.functional;

import java.io.IOException;

/**
 * Version of java.util.function.Consumer which raises
 * exceptions.
 * @param <T> type of argument,.
 */
@FunctionalInterface
public interface ConsumerRaisingIOE<T> {

  /**
   * Process the argument.
   * @param t type
   * @throws IOException if needed
   */
  void accept(T t) throws IOException;

  /**
   * after calling {@link #accept(Object)},
   * invoke the next consumer in the chain.
   * @param next next consumer
   * @return the chain.
   */
  default ConsumerRaisingIOE<T> andThen(
      ConsumerRaisingIOE<? super T> next) {
    return (T t) -> {
      accept(t);
      next.accept(t);
    };
  }
}
