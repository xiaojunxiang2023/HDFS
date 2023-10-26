package org.apache.hadoop.io.retry;

import java.io.Closeable;

/**
 * An implementer of this interface is capable of providing proxy objects for
 * use in IPC communication, and potentially modifying these objects or creating
 * entirely new ones in the event of certain types of failures. The
 * determination of whether or not to fail over is handled by
 * {@link RetryPolicy}.
 */
public interface FailoverProxyProvider<T> extends Closeable {
  static class ProxyInfo<T> {
    public T proxy;
    /*
     * The information (e.g., the IP address) of the current proxy object. It
     * provides information for debugging purposes.
     */
    public String proxyInfo;

    public ProxyInfo(T proxy, String proxyInfo) {
      this.proxy = proxy;
      this.proxyInfo = proxyInfo;
    }

    private String proxyName() {
      return proxy != null ? proxy.getClass().getSimpleName() : "UnknownProxy";
    }

    public String getString(String methodName) {
      return proxyName() + "." + methodName + " over " + proxyInfo;
    }

    @Override
    public String toString() {
      return proxyName() + " over " + proxyInfo;
    }
  }

  /**
   * Get the proxy object which should be used until the next failover event
   * occurs.
   * 
   * @return the proxy object to invoke methods upon
   */
  public ProxyInfo<T> getProxy();

  /**
   * Called whenever the associated {@link RetryPolicy} determines that an error
   * warrants failing over.
   * 
   * @param currentProxy
   *          the proxy object which was being used before this failover event
   */
  public void performFailover(T currentProxy);

  /**
   * Return a reference to the interface this provider's proxy objects actually
   * implement. If any of the methods on this interface are annotated as being
   * {@link Idempotent} or {@link AtMostOnce}, then this fact will be passed to
   * the {@link RetryPolicy#shouldRetry(Exception, int, int, boolean)} method on
   * error, for use in determining whether or not failover should be attempted.
   * 
   * @return the interface implemented by the proxy objects returned by
   *         {@link FailoverProxyProvider#getProxy()}
   */
  public Class<T> getInterface();
}