package org.apache.hadoop.util.concurrent;

import org.apache.hadoop.thirdparty.com.google.common.util.concurrent.AbstractFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/** A {@link Future} implemented using an {@link AsyncGet} object. */
public class AsyncGetFuture<T, E extends Throwable> extends AbstractFuture<T> {
  public static final Logger LOG =
      LoggerFactory.getLogger(AsyncGetFuture.class);

  private final AtomicBoolean called = new AtomicBoolean(false);
  private final AsyncGet<T, E> asyncGet;

  public AsyncGetFuture(AsyncGet<T, E> asyncGet) {
    this.asyncGet = asyncGet;
  }

  private void callAsyncGet(long timeout, TimeUnit unit) {
    if (!isCancelled() && called.compareAndSet(false, true)) {
      try {
        set(asyncGet.get(timeout, unit));
      } catch (TimeoutException te) {
        LOG.trace("TRACE", te);
        called.compareAndSet(true, false);
      } catch (Throwable e) {
        LOG.trace("TRACE", e);
        setException(e);
      }
    }
  }

  @Override
  public T get() throws InterruptedException, ExecutionException {
    callAsyncGet(-1, TimeUnit.MILLISECONDS);
    return super.get();
  }

  @Override
  public T get(long timeout, TimeUnit unit)
      throws InterruptedException, TimeoutException, ExecutionException {
    callAsyncGet(timeout, unit);
    return super.get(0, TimeUnit.MILLISECONDS);
  }

  @Override
  public boolean isDone() {
    callAsyncGet(0, TimeUnit.MILLISECONDS);
    return super.isDone();
  }
}
