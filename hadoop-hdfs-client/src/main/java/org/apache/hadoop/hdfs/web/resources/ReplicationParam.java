package org.apache.hadoop.hdfs.web.resources;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_REPLICATION_DEFAULT;
import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_REPLICATION_KEY;

import org.apache.hadoop.conf.Configuration;

/** Replication parameter. */
public class ReplicationParam extends ShortParam {
  /** Parameter name. */
  public static final String NAME = "replication";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public ReplicationParam(final Short value) {
    super(DOMAIN, value, (short)1, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public ReplicationParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the value or, if it is null, return the default from conf. */
  public short getValue(final Configuration conf) {
    return getValue() != null? getValue()
        : (short)conf.getInt(DFS_REPLICATION_KEY, DFS_REPLICATION_DEFAULT);
  }
}
