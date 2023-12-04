package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.hdfs.server.datanode.DataStorage;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsDatasetSpi;

import java.io.IOException;

/**
 * A factory for creating {@link FsDatasetImpl} objects.
 */
public class FsDatasetFactory extends FsDatasetSpi.Factory<FsDatasetImpl> {
  @Override
  public FsDatasetImpl newInstance(DataNode datanode,
                                   DataStorage storage, Configuration conf) throws IOException {
    return new FsDatasetImpl(datanode, storage, conf);
  }
}
