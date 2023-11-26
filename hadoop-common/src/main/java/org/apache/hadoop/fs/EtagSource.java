package org.apache.hadoop.fs;

/**
 * An optional interface for {@link FileStatus} subclasses to implement
 * to provide access to etags.
 * If available FS SHOULD also implement the matching PathCapabilities
 *   -- etag supported: {@link CommonPathCapabilities#ETAGS_AVAILABLE}.
 *   -- etag consistent over rename:
 *      {@link CommonPathCapabilities#ETAGS_PRESERVED_IN_RENAME}.
 */
public interface EtagSource {

  /**
   * Return an etag of this file status.
   * A return value of null or "" means "no etag"
   * @return a possibly null or empty etag.
   */
  String getEtag();

}
