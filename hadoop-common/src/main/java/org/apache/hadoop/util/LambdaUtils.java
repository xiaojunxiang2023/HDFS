package org.apache.hadoop.util;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/**
 * Lambda-expression utilities be they generic or specific to
 * Hadoop datatypes.
 */
public final class LambdaUtils {

  private LambdaUtils() {
  }

  /**
   * Utility method to evaluate a callable and fill in the future
   * with the result or the exception raised.
   * Once this method returns, the future will have been evaluated to
   * either a return value or an exception.
   * @param <T> type of future
   * @param result future for the result.
   * @param call callable to invoke.
   * @return the future passed in
   */
  public static <T> CompletableFuture<T> eval(
      final CompletableFuture<T> result,
      final Callable<T> call) {
    try {
      result.complete(call.call());
    } catch (Throwable tx) {
      result.completeExceptionally(tx);
    }
    return result;
  }

}
