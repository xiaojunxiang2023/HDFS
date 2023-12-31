package org.apache.hadoop.fs.shell;

import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Abstract command to enable sub copy commands run with multi-thread.
 */
public abstract class CopyCommandWithMultiThread
    extends CommandWithDestination {

  private int threadCount = 1;
  private ThreadPoolExecutor executor = null;
  private int threadPoolQueueSize = DEFAULT_QUEUE_SIZE;

  public static final int DEFAULT_QUEUE_SIZE = 1024;

  /**
   * set thread count by option value, if the value less than 1,
   * use 1 instead.
   *
   * @param optValue option value
   */
  protected void setThreadCount(String optValue) {
    if (optValue != null) {
      threadCount = Math.max(Integer.parseInt(optValue), 1);
    }
  }

  /**
   * set thread pool queue size by option value, if the value less than 1,
   * use DEFAULT_QUEUE_SIZE instead.
   *
   * @param optValue option value
   */
  protected void setThreadPoolQueueSize(String optValue) {
    if (optValue != null) {
      int size = Integer.parseInt(optValue);
      threadPoolQueueSize = size < 1 ? DEFAULT_QUEUE_SIZE : size;
    }
  }


  protected int getThreadCount() {
    return this.threadCount;
  }


  protected int getThreadPoolQueueSize() {
    return this.threadPoolQueueSize;
  }


  protected ThreadPoolExecutor getExecutor() {
    return this.executor;
  }

  @Override
  protected void processArguments(LinkedList<PathData> args)
      throws IOException {

    if (isMultiThreadNecessary(args)) {
      initThreadPoolExecutor();
    }

    super.processArguments(args);

    if (executor != null) {
      waitForCompletion();
    }
  }

  // if thread count is 1 or the source is only one single file,
  // don't init executor to avoid threading overhead.

  protected boolean isMultiThreadNecessary(LinkedList<PathData> args)
      throws IOException {
    return this.threadCount > 1 && hasMoreThanOneSourcePaths(args);
  }

  // check if source is only one single file.
  private boolean hasMoreThanOneSourcePaths(LinkedList<PathData> args)
      throws IOException {
    if (args.size() > 1) {
      return true;
    }
    if (args.size() == 1) {
      PathData src = args.get(0);
      if (src.stat == null) {
        src.refreshStatus();
      }
      return isPathRecursable(src);
    }
    return false;
  }

  private void initThreadPoolExecutor() {
    executor =
        new ThreadPoolExecutor(threadCount, threadCount, 1, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(threadPoolQueueSize),
            new ThreadPoolExecutor.CallerRunsPolicy());
  }

  private void waitForCompletion() {
    if (executor != null) {
      executor.shutdown();
      try {
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
      } catch (InterruptedException e) {
        executor.shutdownNow();
        displayError(e);
        Thread.currentThread().interrupt();
      }
    }
  }

  @Override
  protected void copyFileToTarget(PathData src, PathData target)
      throws IOException {
    if (executor == null) {
      super.copyFileToTarget(src, target);
    } else {
      executor.submit(() -> {
        try {
          super.copyFileToTarget(src, target);
        } catch (IOException e) {
          displayError(e);
        }
      });
    }
  }
}
