package org.apache.hadoop.hdfs.server.datanode.fsdataset;

import org.apache.hadoop.classification.InterfaceAudience;

import java.io.IOException;
import java.util.List;

/**
 * This interface specifies the policy for choosing volumes to store replicas.
 */
@InterfaceAudience.Private
public interface VolumeChoosingPolicy<V extends FsVolumeSpi> {

    /**
     * Choose a volume to place a replica,
     * given a list of volumes and the replica size sought for storage.
     *
     * The caller should synchronize access to the list of volumes.
     *
     * @param volumes - a list of available volumes.
     * @param replicaSize - the size of the replica for which a volume is sought.
     * @param storageId - the storage id of the Volume nominated by the namenode.
     *                  This can usually be ignored by the VolumeChoosingPolicy.
     * @return the chosen volume.
     * @throws IOException when disks are unavailable or are full.
     */
    V chooseVolume(List<V> volumes, long replicaSize, String storageId)
            throws IOException;
}