package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * The Path counterpoint to {@link StreamCapabilities}; a query to see if,
 * a FileSystem/FileContext instance has a specific capability under the given
 * path.
 * Other classes may also implement the interface, as desired.
 *
 * See {@link CommonPathCapabilities} for the well-known capabilities.
 */
public interface PathCapabilities {

  /**
   * Probe for a specific capability under the given path.
   * If the function returns {@code true}, this instance is explicitly
   * declaring that the capability is available.
   * If the function returns {@code false}, it can mean one of:
   * <ul>
   *   <li>The capability is not known.</li>
   *   <li>The capability is known but it is not supported.</li>
   *   <li>The capability is known but the filesystem does not know if it
   *   is supported under the supplied path.</li>
   * </ul>
   * The core guarantee which a caller can rely on is: if the predicate
   * returns true, then the specific operation/behavior can be expected to be
   * supported. However a specific call may be rejected for permission reasons,
   * the actual file/directory not being present, or some other failure during
   * the attempted execution of the operation.
   * <p>
   * Implementors: {@link org.apache.hadoop.fs.impl.PathCapabilitiesSupport}
   * can be used to help implement this method.
   * @param path path to query the capability of.
   * @param capability non-null, non-empty string to query the path for support.
   * @return true if the capability is supported under that part of the FS.
   * @throws IOException this should not be raised, except on problems
   * resolving paths or relaying the call.
   * @throws IllegalArgumentException invalid arguments
   */
  boolean hasPathCapability(Path path, String capability)
      throws IOException;
}
