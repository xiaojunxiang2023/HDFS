package org.apache.hadoop.hdfs.server.datanode.fsdataset;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.util.DiskChecker.DiskOutOfSpaceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Choose volumes with the same storage type in round-robin order.
 * Use fine-grained locks to synchronize volume choosing.
 */
public class RoundRobinVolumeChoosingPolicy<V extends FsVolumeSpi>
    implements VolumeChoosingPolicy<V> {
  public static final Logger LOG =
      LoggerFactory.getLogger(RoundRobinVolumeChoosingPolicy.class);

  // curVolumes stores the RR counters of each storage type.
  // The ordinal of storage type in org.apache.hadoop.fs.StorageType
  // is used as the index to get data from the array.
  private int[] curVolumes;
  // syncLocks stores the locks for each storage type.
  private Object[] syncLocks;

  public RoundRobinVolumeChoosingPolicy() {
    int numStorageTypes = StorageType.values().length;
    curVolumes = new int[numStorageTypes];
    syncLocks = new Object[numStorageTypes];
    for (int i = 0; i < numStorageTypes; i++) {
      syncLocks[i] = new Object();
    }
  }

  @Override
  public V chooseVolume(final List<V> volumes, long blockSize, String storageId)
      throws IOException {

    if (volumes.size() < 1) {
      throw new DiskOutOfSpaceException("No more available volumes");
    }

    // As all the items in volumes are with the same storage type,
    // so only need to get the storage type index of the first item in volumes
    StorageType storageType = volumes.get(0).getStorageType();
    int index = storageType != null ?
        storageType.ordinal() : StorageType.DEFAULT.ordinal();

    synchronized (syncLocks[index]) {
      return chooseVolume(index, volumes, blockSize);
    }
  }

  private V chooseVolume(final int curVolumeIndex, final List<V> volumes,
                         long blockSize) throws IOException {
    // since volumes could've been removed because of the failure
    // make sure we are not out of bounds
    int curVolume = curVolumes[curVolumeIndex] < volumes.size()
        ? curVolumes[curVolumeIndex] : 0;

    int startVolume = curVolume;
    long maxAvailable = 0;

    while (true) {
      final V volume = volumes.get(curVolume);
      curVolume = (curVolume + 1) % volumes.size();
      long availableVolumeSize = volume.getAvailable();
      if (availableVolumeSize > blockSize) {
        curVolumes[curVolumeIndex] = curVolume;
        return volume;
      }

      if (availableVolumeSize > maxAvailable) {
        maxAvailable = availableVolumeSize;
      }

      if (curVolume == startVolume) {
        throw new DiskOutOfSpaceException("Out of space: "
            + "The volume with the most available space (=" + maxAvailable
            + " B) is less than the block size (=" + blockSize + " B).");
      } else {
        LOG.warn("The volume[{}] with the available space (={} B) is "
                + "less than the block size (={} B).", volume.getBaseURI(),
            availableVolumeSize, blockSize);
      }
    }
  }
}
