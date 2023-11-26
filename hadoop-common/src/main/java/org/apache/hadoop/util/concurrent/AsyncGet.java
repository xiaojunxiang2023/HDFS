package org.apache.hadoop.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * This interface defines an asynchronous {@link #get(long, TimeUnit)} method.
 *
 * When the return value is still being computed, invoking
 * {@link #get(long, TimeUnit)} will result in a {@link TimeoutException}.
 * The method should be invoked again and again
 * until the underlying computation is completed.
 *
 * @param <R> The type of the return value.
 * @param <E> The exception type that the underlying implementation may throw.
 */
public interface AsyncGet<R, E extends Throwable> {
  /**
   * Get the result.
   *
   * @param timeout The maximum time period to wait.
   *                When timeout == 0, it does not wait at all.
   *                When timeout &lt; 0, it waits indefinitely.
   * @param unit The unit of the timeout value
   * @return the result, which is possibly null.
   * @throws E an exception thrown by the underlying implementation.
   * @throws TimeoutException if it cannot return after the given time period.
   * @throws InterruptedException if the thread is interrupted.
   */
  R get(long timeout, TimeUnit unit)
      throws E, TimeoutException, InterruptedException;

  /** @return true if the underlying computation is done; false, otherwise. */
  boolean isDone();

  /** Utility */
  class Util {
    /** Use {@link #get(long, TimeUnit)} timeout parameters to wait. */
    public static void wait(Object obj, long timeout, TimeUnit unit)
        throws InterruptedException {
      if (timeout < 0) {
        obj.wait();
      } else if (timeout > 0) {
        obj.wait(unit.toMillis(timeout));
      }
    }
  }
}
