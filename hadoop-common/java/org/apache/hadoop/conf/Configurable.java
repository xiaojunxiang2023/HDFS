package org.apache.hadoop.conf;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** Something that may be configured with a {@link Configuration}. */
@InterfaceAudience.Public
@InterfaceStability.Stable
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
