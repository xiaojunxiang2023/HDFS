package org.apache.hadoop.hdfs.server.datanode.fsdataset;

import java.io.Closeable;
import java.io.IOException;

/**
 * This holds volume reference count as AutoClosable resource.
 * It increases the reference count by one in the constructor, and decreases
 * the reference count by one in {@link #close()}.
 *
 * <pre>
 *  {@code
 *    try (FsVolumeReference ref = volume.obtainReference()) {
 *      // Do IOs on the volume
 *      volume.createRwb(...);
 *      ...
 *    }
 *  }
 * </pre>
 */
public interface FsVolumeReference extends Closeable {
  /**
   * Decrease the reference count of the volume.
   * @throws IOException it never throws IOException.
   */
  @Override
  void close() throws IOException;

  /**
   * Returns the underlying volume object. Return null if the reference was
   * released.
   */
  FsVolumeSpi getVolume();
}
