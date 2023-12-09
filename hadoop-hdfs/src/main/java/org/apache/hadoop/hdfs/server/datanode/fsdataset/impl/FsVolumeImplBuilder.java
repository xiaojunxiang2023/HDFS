package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.DF;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.server.common.Storage.StorageDirectory;
import org.apache.hadoop.hdfs.server.datanode.FileIoProvider;

import java.io.IOException;

/**
 * This class is to be used as a builder for {@link FsVolumeImpl} objects.
 */
public class FsVolumeImplBuilder {

  private FsDatasetImpl dataset;
  private String storageID;
  private StorageDirectory sd;
  private Configuration conf;
  private FileIoProvider fileIoProvider;
  private DF usage;

  public FsVolumeImplBuilder() {
    dataset = null;
    storageID = null;
    sd = null;
    conf = null;
    usage = null;
  }

  FsVolumeImplBuilder setDataset(FsDatasetImpl dataset) {
    this.dataset = dataset;
    return this;
  }

  FsVolumeImplBuilder setStorageID(String id) {
    this.storageID = id;
    return this;
  }

  FsVolumeImplBuilder setStorageDirectory(StorageDirectory sd) {
    this.sd = sd;
    return this;
  }

  FsVolumeImplBuilder setConf(Configuration conf) {
    this.conf = conf;
    return this;
  }

  FsVolumeImplBuilder setFileIoProvider(FileIoProvider fileIoProvider) {
    this.fileIoProvider = fileIoProvider;
    return this;
  }


  FsVolumeImplBuilder setUsage(DF newUsage) {
    this.usage = newUsage;
    return this;
  }

  FsVolumeImpl build() throws IOException {
    if (sd.getStorageLocation().getStorageType() == StorageType.PROVIDED) {
      return new ProvidedVolumeImpl(dataset, storageID, sd,
          fileIoProvider != null ? fileIoProvider :
              new FileIoProvider(null, null), conf);
    }
    if (null == usage) {
      // set usage unless overridden by unit tests
      usage = new DF(sd.getCurrentDir().getParentFile(), conf);
    }
    return new FsVolumeImpl(
        dataset, storageID, sd,
        fileIoProvider != null ? fileIoProvider :
            new FileIoProvider(null, null), conf, usage);
  }
}
