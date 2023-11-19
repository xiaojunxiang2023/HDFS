package org.apache.hadoop.fs.viewfs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;

/**
 * An interface for loading mount-table configuration. This class can have more
 * APIs like refreshing mount tables automatically etc.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface MountTableConfigLoader {

  /**
   * Loads the mount-table configuration into given configuration.
   *
   * @param mountTableConfigPath - Path of the mount table. It can be a file or
   *          a directory in the case of multiple versions of mount-table
   *          files(Recommended option).
   * @param conf - Configuration object to add mount table.
   */
  void load(String mountTableConfigPath, Configuration conf)
      throws IOException;
}
