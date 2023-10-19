package org.apache.hadoop.fs;

import java.net.URI;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * FileSystem related constants.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public interface FsConstants {
  // URI for local filesystem
  public static final URI LOCAL_FS_URI = URI.create("file:///");
  
  // URI scheme for FTP
  public static final String FTP_SCHEME = "ftp";

  // Maximum number of symlinks to recursively resolve in a path
  static final int MAX_PATH_LINKS = 32;

  /**
   * ViewFs: viewFs file system (ie the mount file system on client side)
   */
  public static final URI VIEWFS_URI = URI.create("viewfs:///");
  public static final String VIEWFS_SCHEME = "viewfs";
  String FS_VIEWFS_OVERLOAD_SCHEME_TARGET_FS_IMPL_PATTERN =
      "fs.viewfs.overload.scheme.target.%s.impl";
  String VIEWFS_TYPE = "viewfs";
}
