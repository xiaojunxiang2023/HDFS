package org.apache.hadoop.conf;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** Base class for things that may be configured with a {@link Configuration}. */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class Configured implements Configurable {

  private Configuration conf;

  /** Construct a Configured. */
  public Configured() {
    this(null);
  }
  
  /** Construct a Configured. */
  public Configured(Configuration conf) {
    setConf(conf);
  }

  // inherit javadoc
  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
  }

  // inherit javadoc
  @Override
  public Configuration getConf() {
    return conf;
  }

}
