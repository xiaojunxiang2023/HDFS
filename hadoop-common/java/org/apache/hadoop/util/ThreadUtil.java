package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceStability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

@InterfaceStability.Evolving
public class ThreadUtil {
  
  private static final Logger LOG = LoggerFactory.getLogger(ThreadUtil.class);

  /**
   * Cause the current thread to sleep as close as possible to the provided
   * number of milliseconds. This method will log and ignore any
   * {@link InterruptedException} encountered.
   * 
   * @param millis the number of milliseconds for the current thread to sleep
   */
  public static void sleepAtLeastIgnoreInterrupts(long millis) {
    long start = Time.now();
    while (Time.now() - start < millis) {
      long timeToSleep = millis -
          (Time.now() - start);
      try {
        Thread.sleep(timeToSleep);
      } catch (InterruptedException ie) {
        LOG.warn("interrupted while sleeping", ie);
      }
    }
  }

  /**
   * Join a thread as uninterruptible.
   * The call continues to block until the result is available even when the
   * caller thread is interrupted.
   * The method will log any {@link InterruptedException} then will re-interrupt
   * the thread.
   *
   * @param toJoin the thread to Join on.
   */
  public static void joinUninterruptibly(Thread toJoin) {
    boolean interrupted = false;
    try {
      while (true) {
        try {
          toJoin.join();
          return;
        } catch (InterruptedException e) {
          interrupted = true;
          LOG.warn("interrupted while sleeping", e);
        }
      }
    } finally {
      if (interrupted) {
        Thread.currentThread().interrupt();
      }
    }
  }

  /**
   * Convenience method that returns a resource as inputstream from the
   * classpath.
   * <p>
   * Uses the Thread's context classloader to load resource.
   *
   * @param resourceName resource to retrieve.
   *
   * @throws IOException thrown if resource cannot be loaded
   * @return inputstream with the resource.
   */
  public static InputStream getResourceAsStream(String resourceName)
      throws IOException {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    if (cl == null) {
      throw new IOException("Can not read resource file '" + resourceName +
          "' because class loader of the current thread is null");
    }
    return getResourceAsStream(cl, resourceName);
  }

  /**
   * Convenience method that returns a resource as inputstream from the
   * classpath using given classloader.
   * <p>
   *
   * @param cl ClassLoader to be used to retrieve resource.
   * @param resourceName resource to retrieve.
   *
   * @throws IOException thrown if resource cannot be loaded
   * @return inputstream with the resource.
   */
  public static InputStream getResourceAsStream(ClassLoader cl,
        String resourceName)
        throws IOException {
    if (cl == null) {
      throw new IOException("Can not read resource file '" + resourceName +
          "' because given class loader is null");
    }
    InputStream is = cl.getResourceAsStream(resourceName);
    if (is == null) {
      throw new IOException("Can not read resource file '" +
          resourceName + "'");
    }
    return is;
  }


}
