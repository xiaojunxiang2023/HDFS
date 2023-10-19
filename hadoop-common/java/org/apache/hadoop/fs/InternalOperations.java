package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;


/**
 *   This method allows access to Package-scoped operations from classes
 *   in org.apache.hadoop.fs.impl and other file system implementations
 *   in the hadoop modules.
 *   This is absolutely not for used by any other application or library.
 */
@InterfaceAudience.Private
public class InternalOperations {

  @SuppressWarnings("deprecation") // rename w/ OVERWRITE
  public void rename(FileSystem fs, final Path src, final Path dst,
      final Options.Rename...options) throws IOException {
    fs.rename(src, dst, options);
  }
}
