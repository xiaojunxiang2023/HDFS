package org.apache.hadoop.security.ssl;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimerTask;
import java.util.function.Consumer;

/**
 * Implements basic logic to track when a file changes on disk and call the action
 * passed to the constructor when it does. An exception handler can optionally also be specified
 * in the constructor, otherwise any exception occurring during process will be logged
 * using this class' logger.
 */
public class FileMonitoringTimerTask extends TimerTask {

  static final Logger LOG = LoggerFactory.getLogger(FileMonitoringTimerTask.class);

  @VisibleForTesting
  static final String PROCESS_ERROR_MESSAGE =
      "Could not process file change : ";

  final private List<Path> filePaths;
  final private Consumer<Path> onFileChange;
  final Consumer<Throwable> onChangeFailure;
  private List<Long> lastProcessed;

  /**
   * See {@link #FileMonitoringTimerTask(List, Consumer, Consumer)}.
   *
   * @param filePath The file to monitor.
   * @param onFileChange What to do when the file changes.
   * @param onChangeFailure What to do when <code>onFileChange</code>
   *                        throws an exception.
   */
  public FileMonitoringTimerTask(Path filePath, Consumer<Path> onFileChange,
                                 Consumer<Throwable> onChangeFailure) {
    this(Collections.singletonList(filePath), onFileChange, onChangeFailure);
  }

  /**
   * Create file monitoring task to be scheduled using a standard
   * Java {@link java.util.Timer} instance.
   *
   * @param filePaths The path to the file to monitor.
   * @param onFileChange The function to call when the file has changed.
   * @param onChangeFailure The function to call when an exception is
   *                       thrown during the file change processing.
   */
  public FileMonitoringTimerTask(List<Path> filePaths,
                                 Consumer<Path> onFileChange,
                                 Consumer<Throwable> onChangeFailure) {
    Preconditions.checkNotNull(filePaths,
        "path to monitor disk file is not set");
    Preconditions.checkNotNull(onFileChange,
        "action to monitor disk file is not set");

    this.filePaths = new ArrayList<Path>(filePaths);
    this.lastProcessed = new ArrayList<Long>();
    this.filePaths.forEach(path ->
        this.lastProcessed.add(path.toFile().lastModified()));
    this.onFileChange = onFileChange;
    this.onChangeFailure = onChangeFailure;
  }

  @Override
  public void run() {
    int modified = -1;
    for (int i = 0; i < filePaths.size() && modified < 0; i++) {
      if (lastProcessed.get(i) != filePaths.get(i).toFile().lastModified()) {
        modified = i;
      }
    }
    if (modified > -1) {
      Path filePath = filePaths.get(modified);
      try {
        onFileChange.accept(filePath);
      } catch (Throwable t) {
        if (onChangeFailure  != null) {
          onChangeFailure.accept(t);
        } else {
          LOG.error(PROCESS_ERROR_MESSAGE + filePath.toString(), t);
        }
      }
      lastProcessed.set(modified, filePath.toFile().lastModified());
    }
  }
}
