package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;

/** Buffer size parameter. */
public class BufferSizeParam extends IntegerParam {
  /** Parameter name. */
  public static final String NAME = "buffersize";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public BufferSizeParam(final Integer value) {
    super(DOMAIN, value, 1, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public BufferSizeParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the value or, if it is null, return the default from conf. */
  public int getValue(final Configuration conf) {
    return getValue() != null? getValue()
        : conf.getInt(
            CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_KEY,
            CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT);
  }
}
