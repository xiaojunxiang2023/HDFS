package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.conf.Configuration;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_BLOCK_SIZE_DEFAULT;
import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_BLOCK_SIZE_KEY;

/** Block size parameter. */
public class BlockSizeParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "blocksize";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public BlockSizeParam(final Long value) {
    super(DOMAIN, value, 1L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public BlockSizeParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the value or, if it is null, return the default from conf. */
  public long getValue(final Configuration conf) {
    return getValue() != null ? getValue()
        : conf.getLongBytes(DFS_BLOCK_SIZE_KEY, DFS_BLOCK_SIZE_DEFAULT);
  }
}
