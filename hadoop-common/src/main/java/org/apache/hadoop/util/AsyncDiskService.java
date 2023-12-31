package org.apache.hadoop.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * This class is a container of multiple thread pools, each for a volume,
 * so that we can schedule async disk operations easily.
 *
 * Examples of async disk operations are deletion of files.
 * We can move the files to a "TO_BE_DELETED" folder before asychronously
 * deleting it, to make sure the caller can run it faster.
 */
public class AsyncDiskService {

  public static final Logger LOG =
      LoggerFactory.getLogger(AsyncDiskService.class);

  // ThreadPool core pool size
  private static final int CORE_THREADS_PER_VOLUME = 1;
  // ThreadPool maximum pool size
  private static final int MAXIMUM_THREADS_PER_VOLUME = 4;
  // ThreadPool keep-alive time for threads over core pool size
  private static final long THREADS_KEEP_ALIVE_SECONDS = 60;

  private final ThreadGroup threadGroup = new ThreadGroup("async disk service");

  private ThreadFactory threadFactory;

  private HashMap<String, ThreadPoolExecutor> executors
      = new HashMap<String, ThreadPoolExecutor>();

  /**
   * Create a AsyncDiskServices with a set of volumes (specified by their
   * root directories).
   *
   * The AsyncDiskServices uses one ThreadPool per volume to do the async
   * disk operations.
   *
   * @param volumes The roots of the file system volumes.
   */
  public AsyncDiskService(String[] volumes) {

    threadFactory = new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
        return new Thread(threadGroup, r);
      }
    };

    // Create one ThreadPool per volume
    for (int v = 0; v < volumes.length; v++) {
      ThreadPoolExecutor executor = new ThreadPoolExecutor(
          CORE_THREADS_PER_VOLUME, MAXIMUM_THREADS_PER_VOLUME,
          THREADS_KEEP_ALIVE_SECONDS, TimeUnit.SECONDS,
          new LinkedBlockingQueue<Runnable>(), threadFactory);

      // This can reduce the number of running threads
      executor.allowCoreThreadTimeOut(true);
      executors.put(volumes[v], executor);
    }

  }

  /**
   * Execute the task sometime in the future, using ThreadPools.
   */
  public synchronized void execute(String root, Runnable task) {
    ThreadPoolExecutor executor = executors.get(root);
    if (executor == null) {
      throw new RuntimeException("Cannot find root " + root
          + " for execution of task " + task);
    } else {
      executor.execute(task);
    }
  }

  /**
   * Gracefully start the shut down of all ThreadPools.
   */
  public synchronized void shutdown() {

    LOG.info("Shutting down all AsyncDiskService threads...");

    for (Map.Entry<String, ThreadPoolExecutor> e
        : executors.entrySet()) {
      e.getValue().shutdown();
    }
  }

  /**
   * Wait for the termination of the thread pools.
   *
   * @param milliseconds  The number of milliseconds to wait
   * @return true if all thread pools are terminated without time limit
   * @throws InterruptedException
   */
  public synchronized boolean awaitTermination(long milliseconds)
      throws InterruptedException {

    long end = Time.now() + milliseconds;
    for (Map.Entry<String, ThreadPoolExecutor> e :
        executors.entrySet()) {
      ThreadPoolExecutor executor = e.getValue();
      if (!executor.awaitTermination(
          Math.max(end - Time.now(), 0),
          TimeUnit.MILLISECONDS)) {
        LOG.warn("AsyncDiskService awaitTermination timeout.");
        return false;
      }
    }
    LOG.info("All AsyncDiskService threads are terminated.");
    return true;
  }

  /**
   * Shut down all ThreadPools immediately.
   */
  public synchronized List<Runnable> shutdownNow() {

    LOG.info("Shutting down all AsyncDiskService threads immediately...");

    List<Runnable> list = new ArrayList<Runnable>();
    for (Map.Entry<String, ThreadPoolExecutor> e
        : executors.entrySet()) {
      list.addAll(e.getValue().shutdownNow());
    }
    return list;
  }

}
