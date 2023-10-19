package org.apache.hadoop.fs;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Interface filesystems MAY implement to offer a batched list.
 * If implemented, filesystems SHOULD declare
 * {@link CommonPathCapabilities#FS_EXPERIMENTAL_BATCH_LISTING} to be a supported
 * path capability.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public interface BatchListingOperations {

  /**
   * Batched listing API that returns {@link PartialListing}s for the
   * passed Paths.
   *
   * @param paths List of paths to list.
   * @return RemoteIterator that returns corresponding PartialListings.
   * @throws IOException failure
   */
  RemoteIterator<PartialListing<FileStatus>> batchedListStatusIterator(
      List<Path> paths) throws IOException;

  /**
   * Batched listing API that returns {@link PartialListing}s for the passed
   * Paths. The PartialListing will contain {@link LocatedFileStatus} entries
   * with locations.
   *
   * @param paths List of paths to list.
   * @return RemoteIterator that returns corresponding PartialListings.
   * @throws IOException failure
   */
  RemoteIterator<PartialListing<LocatedFileStatus>>
      batchedListLocatedStatusIterator(
          List<Path> paths) throws IOException;

}
