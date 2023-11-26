package org.apache.hadoop.hdfs.server.common;
import org.apache.hadoop.hdfs.server.namenode.JournalManager;

import java.io.File;

/**
 * Interface which implementations of {@link JournalManager} can use to report
 * errors on underlying storage directories. This avoids a circular dependency
 * between journal managers and the storage which instantiates them.
 */
public interface StorageErrorReporter {

    /**
     * Indicate that some error occurred on the given file.
     *
     * @param f the file which had an error.
     */
    public void reportErrorOnFile(File f);
}
