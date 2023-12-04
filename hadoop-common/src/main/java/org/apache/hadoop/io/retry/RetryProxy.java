package org.apache.hadoop.io.retry;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * <p>
 * A factory for creating retry proxies.
 * </p>
 */
public class RetryProxy {
  /**
   * <p>
   * Create a proxy for an interface of an implementation class
   * using the same retry policy for each method in the interface. 
   * </p>
   * @param iface the interface that the retry will implement
   * @param implementation the instance whose methods should be retried
   * @param retryPolicy the policy for retrying method call failures
   * @return the retry proxy
   */
  public static <T> Object create(Class<T> iface, T implementation,
                                  RetryPolicy retryPolicy) {
    return RetryProxy.create(iface,
        new DefaultFailoverProxyProvider<T>(iface, implementation),
        retryPolicy);
  }

  /**
   * Create a proxy for an interface of implementations of that interface using
   * the given {@link FailoverProxyProvider} and the same retry policy for each
   * method in the interface.
   *
   * @param iface the interface that the retry will implement
   * @param proxyProvider provides implementation instances whose methods should be retried
   * @param retryPolicy the policy for retrying or failing over method call failures
   * @return the retry proxy
   */
  public static <T> Object create(Class<T> iface,
                                  FailoverProxyProvider<T> proxyProvider, RetryPolicy retryPolicy) {
    return Proxy.newProxyInstance(
        proxyProvider.getInterface().getClassLoader(),
        new Class<?>[]{iface},
        new RetryInvocationHandler<T>(proxyProvider, retryPolicy)
    );
  }

  /**
   * Create a proxy for an interface of an implementation class
   * using the a set of retry policies specified by method name.
   * If no retry policy is defined for a method then a default of
   * {@link RetryPolicies#TRY_ONCE_THEN_FAIL} is used.
   *
   * @param iface the interface that the retry will implement
   * @param implementation the instance whose methods should be retried
   * @param methodNameToPolicyMap a map of method names to retry policies
   * @return the retry proxy
   */
  public static <T> Object create(Class<T> iface, T implementation,
                                  Map<String, RetryPolicy> methodNameToPolicyMap) {
    return create(iface,
        new DefaultFailoverProxyProvider<T>(iface, implementation),
        methodNameToPolicyMap,
        RetryPolicies.TRY_ONCE_THEN_FAIL);
  }

  /**
   * Create a proxy for an interface of implementations of that interface using
   * the given {@link FailoverProxyProvider} and the a set of retry policies
   * specified by method name. If no retry policy is defined for a method then a
   * default of {@link RetryPolicies#TRY_ONCE_THEN_FAIL} is used.
   *
   * @param iface the interface that the retry will implement
   * @param proxyProvider provides implementation instances whose methods should be retried
   * @param methodNameToPolicyMap map of method names to retry policies
   * @return the retry proxy
   */
  public static <T> Object create(Class<T> iface,
                                  FailoverProxyProvider<T> proxyProvider,
                                  Map<String, RetryPolicy> methodNameToPolicyMap,
                                  RetryPolicy defaultPolicy) {
    return Proxy.newProxyInstance(
        proxyProvider.getInterface().getClassLoader(),
        new Class<?>[]{iface},
        new RetryInvocationHandler<T>(proxyProvider, defaultPolicy,
            methodNameToPolicyMap)
    );
  }
}
