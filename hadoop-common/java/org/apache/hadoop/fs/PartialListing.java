package org.apache.hadoop.fs;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.ipc.RemoteException;

import java.io.IOException;
import java.util.List;

/**
 * A partial listing of the children of a parent directory. Since it is a
 * partial listing, multiple PartialListing may need to be combined to obtain
 * the full listing of a parent directory.
 * <p/>
 * ListingBatch behaves similar to a Future, in that getting the result via
 * {@link #get()} will throw an Exception if there was a failure.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class PartialListing<T extends FileStatus> {
  private final Path listedPath;
  private final List<T> partialListing;
  private final RemoteException exception;

  public PartialListing(Path listedPath, List<T> partialListing) {
    this(listedPath, partialListing, null);
  }

  public PartialListing(Path listedPath, RemoteException exception) {
    this(listedPath, null, exception);
  }

  private PartialListing(Path listedPath, List<T> partialListing,
      RemoteException exception) {
    Preconditions.checkArgument(partialListing == null ^ exception == null);
    this.partialListing = partialListing;
    this.listedPath = listedPath;
    this.exception = exception;
  }

  /**
   * Partial listing of the path being listed. In the case where the path is
   * a file. The list will be a singleton with the file itself.
   *
   * @return Partial listing of the path being listed.
   * @throws IOException if there was an exception getting the listing.
   */
  public List<T> get() throws IOException {
    if (exception != null) {
      throw exception.unwrapRemoteException();
    }
    return partialListing;
  }

  /**
   * Path being listed.
   *
   * @return the path being listed.
   */
  public Path getListedPath() {
    return listedPath;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("listedPath", listedPath)
        .append("partialListing", partialListing)
        .append("exception", exception)
        .toString();
  }
}
