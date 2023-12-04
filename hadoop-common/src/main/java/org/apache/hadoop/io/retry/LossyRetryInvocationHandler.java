package org.apache.hadoop.io.retry;

import org.apache.hadoop.ipc.RetriableException;

import java.lang.reflect.Method;

/**
 * A dummy invocation handler extending RetryInvocationHandler. It drops the
 * first N number of responses. This invocation handler is only used for testing.
 */
public class LossyRetryInvocationHandler<T> extends RetryInvocationHandler<T> {
  private final int numToDrop;
  private static final ThreadLocal<Integer> RetryCount =
      new ThreadLocal<Integer>();

  public LossyRetryInvocationHandler(int numToDrop,
                                     FailoverProxyProvider<T> proxyProvider, RetryPolicy retryPolicy) {
    super(proxyProvider, retryPolicy);
    this.numToDrop = numToDrop;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
      throws Throwable {
    RetryCount.set(0);
    return super.invoke(proxy, method, args);
  }

  @Override
  protected Object invokeMethod(Method method, Object[] args) throws Throwable {
    Object result = super.invokeMethod(method, args);
    int retryCount = RetryCount.get();
    if (retryCount < this.numToDrop) {
      RetryCount.set(++retryCount);
      if (LOG.isDebugEnabled()) {
        LOG.debug("Drop the response. Current retryCount == " + retryCount);
      }
      throw new RetriableException("Fake Exception");
    } else {
      if (LOG.isDebugEnabled()) {
        LOG.debug("retryCount == " + retryCount
            + ". It's time to normally process the response");
      }
      return result;
    }
  }
}
