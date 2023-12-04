package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.fs.CachingGetSpaceUsed;
import org.apache.hadoop.fs.GetSpaceUsed;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.FsVolumeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Fast and accurate class to tell how much space HDFS is using.
 */
public abstract class FSCachingGetSpaceUsed extends CachingGetSpaceUsed {
  static final Logger LOG =
      LoggerFactory.getLogger(FSCachingGetSpaceUsed.class);

  public FSCachingGetSpaceUsed(Builder builder) throws IOException {
    super(builder);
  }

  /**
   * The builder class.
   */
  public static class Builder extends GetSpaceUsed.Builder {
    private FsVolumeImpl volume;
    private String bpid;

    public FsVolumeImpl getVolume() {
      return volume;
    }

    public Builder setVolume(FsVolumeImpl fsVolume) {
      this.volume = fsVolume;
      return this;
    }

    public String getBpid() {
      return bpid;
    }

    public Builder setBpid(String bpid) {
      this.bpid = bpid;
      return this;
    }

    @Override
    public GetSpaceUsed build() throws IOException {
      Class clazz = getKlass();
      if (FSCachingGetSpaceUsed.class.isAssignableFrom(clazz)) {
        try {
          setCons(clazz.getConstructor(Builder.class));
        } catch (NoSuchMethodException e) {
          throw new RuntimeException(e);
        }
      }
      return super.build();
    }
  }
}
