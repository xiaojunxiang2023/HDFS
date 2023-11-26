package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * Fast but inaccurate class to tell how much space HDFS is using.
 * This class makes the assumption that the entire mount is used for
 * HDFS and that no two hdfs data dirs are on the same disk.
 *
 * To use set fs.getspaceused.classname
 * to org.apache.hadoop.fs.DFCachingGetSpaceUsed in your core-site.xml
 *
 */
// MapReduce也可见
public class DFCachingGetSpaceUsed extends CachingGetSpaceUsed {
  private final DF df;

  public DFCachingGetSpaceUsed(Builder builder) throws IOException {
    super(builder);
    this.df = new DF(builder.getPath(), builder.getInterval());
  }

  @Override
  protected void refresh() {
    this.used.set(df.getUsed());
  }
}
