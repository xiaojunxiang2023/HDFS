package org.apache.hadoop.conf;

/** Something that may be configured with a {@link Configuration}. */
public interface Configurable {

  /**
   * Set the configuration to be used by this object.
   * @param conf configuration to be used
   */
  void setConf(Configuration conf);

  /**
   * Return the configuration used by this object.
   * @return Configuration
   */
  Configuration getConf();
}
